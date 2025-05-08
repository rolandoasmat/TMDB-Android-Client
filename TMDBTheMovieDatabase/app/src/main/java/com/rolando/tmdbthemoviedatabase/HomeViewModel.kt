package com.rolando.tmdbthemoviedatabase

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: TheMovieDatabaseRepository,
): ViewModel() {

    init {
        fetchPopularMovies()
    }


    private fun fetchPopularMovies() {
        viewModelScope.launch {

        }

    }


}