package com.riad804.kotlinnewsapp.core.presentation

sealed interface Screen {

    @kotlinx.serialization.Serializable
    data object News: Screen

    @kotlinx.serialization.Serializable
    data class Article(val articleId: String): Screen
}