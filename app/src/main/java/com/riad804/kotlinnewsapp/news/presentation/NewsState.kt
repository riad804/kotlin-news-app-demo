package com.riad804.kotlinnewsapp.news.presentation

import com.riad804.kotlinnewsapp.core.domain.Article

data class NewsState (
    val articleList: List<Article> = emptyList(),
    val nextPage: String? = null,
    val isLoading: Boolean = false,
    val isError: Boolean = false,
)