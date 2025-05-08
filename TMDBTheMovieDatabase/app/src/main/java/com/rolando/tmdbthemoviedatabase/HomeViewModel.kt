package com.rolando.tmdbthemoviedatabase

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: TheMovieDatabaseRepository,
): ViewModel() {

    private val _state = MutableStateFlow(HomeScreenViewState(movies = emptyList()))
    val state: StateFlow<HomeScreenViewState> = _state

    init {
        fetchPopularMovies()
    }


    private fun fetchPopularMovies() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = repository.getPopularMovies()
            when(result) {
                is Result.Success -> {
                    onSuccess(result)
                }
                is Result.Error -> {
                    // TODO RAA handle error
                }
            }
        }
    }

    private suspend fun onSuccess(result: Result.Success<MoviesList>) {
        val viewState = HomeScreenViewState(
            movies = result.data.movies.map { movie ->
                MovieItemViewState(
                    displayName = movie.title,
                    imageUrl = movie.imageUrl,
                )
            }
        )
        _state.emit(viewState)
    }
}