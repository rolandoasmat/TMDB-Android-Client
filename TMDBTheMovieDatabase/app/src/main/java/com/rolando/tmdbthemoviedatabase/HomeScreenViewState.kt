package com.rolando.tmdbthemoviedatabase

import androidx.compose.runtime.Immutable

@Immutable
data class HomeScreenViewState(val movies: List<MovieItemViewState>)

@Immutable
data class MovieItemViewState(
    val id: Long,
    val displayName: String,
    val imageUrl: String,
)