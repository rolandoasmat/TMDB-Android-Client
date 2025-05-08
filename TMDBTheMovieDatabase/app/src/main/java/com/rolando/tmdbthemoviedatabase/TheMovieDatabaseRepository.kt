package com.rolando.tmdbthemoviedatabase

interface TheMovieDatabaseRepository {

    suspend fun getPopularMovies(): Result<MoviesList>
}