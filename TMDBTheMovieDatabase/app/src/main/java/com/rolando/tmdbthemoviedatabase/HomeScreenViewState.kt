package com.rolando.tmdbthemoviedatabase

import androidx.compose.runtime.Immutable

@Immutable
data class HomeScreenViewState(val movies: List<MovieItemViewState>)

@Immutable
data class MovieItemViewState(
    val displayName: String,
    val imageUrl: String,
)