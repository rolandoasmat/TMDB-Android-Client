package com.rolando.tmdbthemoviedatabase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.rolando.tmdbthemoviedatabase.ui.theme.TMDBTheMovieDatabaseTheme
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.components.ViewModelComponent
import kotlinx.serialization.Serializable


@Serializable
object Home

@Serializable
data class MovieDetails(val id: Long, val name: String)

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            TMDBTheMovieDatabaseTheme {

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Home) {
                        composable<Home> {
                            val viewModel: HomeViewModel = hiltViewModel()
                            val state by viewModel.state.collectAsStateWithLifecycle()
                            HomeScreen(
                                state = state,
                                onImageTap = { movieId ->
                                    navController.navigate(MovieDetails(id = movieId, name = "my test"))
                                },
                                modifier = Modifier.padding(innerPadding)
                            )
                        }
                        composable<MovieDetails> {
                            val args = it.toRoute<MovieDetails>()
                            val viewModel: MovieDetailsViewModel = hiltViewModel()
                            val state by viewModel.state.collectAsStateWithLifecycle()
                            MovieDetailsScreen(state)
                        }
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TMDBTheMovieDatabaseTheme {
        Greeting("Android")
    }
}

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindAnalyticsService(
        impl: TheMovieDatabaseRepositoryImpl
    ): TheMovieDatabaseRepository
}