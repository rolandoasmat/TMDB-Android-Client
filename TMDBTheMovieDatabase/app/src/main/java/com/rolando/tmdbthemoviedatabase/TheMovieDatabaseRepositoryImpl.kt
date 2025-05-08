package com.rolando.tmdbthemoviedatabase

import javax.inject.Inject

class TheMovieDatabaseRepositoryImpl @Inject constructor(): TheMovieDatabaseRepository {
    override suspend fun getPopularMovies(): Result<MoviesList> {
        return Result.Success(data = MoviesList(
            movies = listOf(
                MovieInfo(id = 1, title = "DBZ", imageUrl = "https://www.citypng.com/public/uploads/preview/dragon-ball-z-logo-download-png-7017516947067563zggkgegzs.png"),
                MovieInfo(id = 2, title = "JJK", imageUrl = "https://i.pinimg.com/originals/df/09/da/df09daf2b40b6db7b976ed9d44e8725c.png"),
                MovieInfo(id = 3, title = "DBZ", imageUrl = "https://www.citypng.com/public/uploads/preview/dragon-ball-z-logo-download-png-7017516947067563zggkgegzs.png"),
                MovieInfo(id = 4, title = "JJK", imageUrl = "https://i.pinimg.com/originals/df/09/da/df09daf2b40b6db7b976ed9d44e8725c.png"),
                MovieInfo(id = 5, title = "DBZ", imageUrl = "https://www.citypng.com/public/uploads/preview/dragon-ball-z-logo-download-png-7017516947067563zggkgegzs.png"),
                MovieInfo(id = 6, title = "JJK", imageUrl = "https://i.pinimg.com/originals/df/09/da/df09daf2b40b6db7b976ed9d44e8725c.png"),
                MovieInfo(id = 7, title = "DBZ", imageUrl = "https://www.citypng.com/public/uploads/preview/dragon-ball-z-logo-download-png-7017516947067563zggkgegzs.png"),
                MovieInfo(id = 8, title = "JJK", imageUrl = "https://i.pinimg.com/originals/df/09/da/df09daf2b40b6db7b976ed9d44e8725c.png"),
                MovieInfo(id = 9, title = "DBZ", imageUrl = "https://www.citypng.com/public/uploads/preview/dragon-ball-z-logo-download-png-7017516947067563zggkgegzs.png"),
                MovieInfo(id = 10, title = "JJK", imageUrl = "https://i.pinimg.com/originals/df/09/da/df09daf2b40b6db7b976ed9d44e8725c.png"),
                MovieInfo(id = 11, title = "DBZ", imageUrl = "https://www.citypng.com/public/uploads/preview/dragon-ball-z-logo-download-png-7017516947067563zggkgegzs.png"),
                MovieInfo(id = 12, title = "JJK", imageUrl = "https://i.pinimg.com/originals/df/09/da/df09daf2b40b6db7b976ed9d44e8725c.png"),
                MovieInfo(id = 13, title = "DBZ", imageUrl = "https://www.citypng.com/public/uploads/preview/dragon-ball-z-logo-download-png-7017516947067563zggkgegzs.png"),
                MovieInfo(id = 14, title = "JJK", imageUrl = "https://i.pinimg.com/originals/df/09/da/df09daf2b40b6db7b976ed9d44e8725c.png"),
            )
        ))
    }
}