package com.riad804.kotlinnewsapp.news.presentation

sealed interface NewsAction {
    data object Paginate: NewsAction
}