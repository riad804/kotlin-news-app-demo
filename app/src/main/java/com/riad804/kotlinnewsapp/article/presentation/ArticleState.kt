package com.riad804.kotlinnewsapp.article.presentation

import com.riad804.kotlinnewsapp.core.domain.Article

data class ArticleState(
    val article: Article? = null,
    val isLoading: Boolean = false,
    val isError: Boolean = false
)
