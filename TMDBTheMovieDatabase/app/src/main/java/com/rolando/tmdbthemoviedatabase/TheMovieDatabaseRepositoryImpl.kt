package com.rolando.tmdbthemoviedatabase

import javax.inject.Inject

class TheMovieDatabaseRepositoryImpl @Inject constructor(): TheMovieDatabaseRepository {
    override suspend fun getPopularMovies(): Result<MoviesList> {
        return Result.Success(data = MoviesList(movies = emptyList()))
    }
}