package com.riad804.kotlinnewsapp.core.domain

data class NewsList(
    val nextPage: String?,
    val articles: List<Article>
)