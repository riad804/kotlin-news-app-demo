package com.riad804.kotlinnewsapp.article.presentation

interface ArticleAction {
    data class LoadArticle(val articleId: String): ArticleAction
}