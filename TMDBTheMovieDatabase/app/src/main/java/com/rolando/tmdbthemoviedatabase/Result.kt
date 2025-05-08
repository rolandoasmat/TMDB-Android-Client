package com.rolando.tmdbthemoviedatabase

sealed class Result<SuccessType> {
    data class Success<SuccessType> (val data: SuccessType) : Result<SuccessType>()
    data class Error<SuccessType> (val error: Throwable) : Result<SuccessType> ()
}