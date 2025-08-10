package com.riad804.kotlinnewsapp.core.domain

sealed class NewsResult<T> (
    val data: T? = null,
    var error: String?
) {
    class Success<T>(data: T) : NewsResult<T>(data, null)
    class Error<T>(error: String?) : NewsResult<T>(null, error)
}