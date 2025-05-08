package com.rolando.tmdbthemoviedatabase

import javax.inject.Inject

class TheMovieDatabaseRepositoryImpl @Inject constructor(): TheMovieDatabaseRepository {
    override suspend fun getPopularMovies(): Result<MoviesList> {
        return Result.Success(data = MoviesList(
            movies = listOf(
                MovieInfo(title = "DBZ", imageUrl = "https://www.citypng.com/public/uploads/preview/dragon-ball-z-logo-download-png-7017516947067563zggkgegzs.png"),
                MovieInfo(title = "JJK", imageUrl = "https://i.pinimg.com/originals/df/09/da/df09daf2b40b6db7b976ed9d44e8725c.png"),
                MovieInfo(title = "DBZ", imageUrl = "https://www.citypng.com/public/uploads/preview/dragon-ball-z-logo-download-png-7017516947067563zggkgegzs.png"),
                MovieInfo(title = "JJK", imageUrl = "https://i.pinimg.com/originals/df/09/da/df09daf2b40b6db7b976ed9d44e8725c.png"),
                MovieInfo(title = "DBZ", imageUrl = "https://www.citypng.com/public/uploads/preview/dragon-ball-z-logo-download-png-7017516947067563zggkgegzs.png"),
                MovieInfo(title = "JJK", imageUrl = "https://i.pinimg.com/originals/df/09/da/df09daf2b40b6db7b976ed9d44e8725c.png"),
                MovieInfo(title = "DBZ", imageUrl = "https://www.citypng.com/public/uploads/preview/dragon-ball-z-logo-download-png-7017516947067563zggkgegzs.png"),
                MovieInfo(title = "JJK", imageUrl = "https://i.pinimg.com/originals/df/09/da/df09daf2b40b6db7b976ed9d44e8725c.png"),
                MovieInfo(title = "DBZ", imageUrl = "https://www.citypng.com/public/uploads/preview/dragon-ball-z-logo-download-png-7017516947067563zggkgegzs.png"),
                MovieInfo(title = "JJK", imageUrl = "https://i.pinimg.com/originals/df/09/da/df09daf2b40b6db7b976ed9d44e8725c.png"),
                MovieInfo(title = "DBZ", imageUrl = "https://www.citypng.com/public/uploads/preview/dragon-ball-z-logo-download-png-7017516947067563zggkgegzs.png"),
                MovieInfo(title = "JJK", imageUrl = "https://i.pinimg.com/originals/df/09/da/df09daf2b40b6db7b976ed9d44e8725c.png"),
                MovieInfo(title = "DBZ", imageUrl = "https://www.citypng.com/public/uploads/preview/dragon-ball-z-logo-download-png-7017516947067563zggkgegzs.png"),
                MovieInfo(title = "JJK", imageUrl = "https://i.pinimg.com/originals/df/09/da/df09daf2b40b6db7b976ed9d44e8725c.png"),
            )
        ))
    }
}