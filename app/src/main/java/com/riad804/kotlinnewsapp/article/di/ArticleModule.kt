package com.riad804.kotlinnewsapp.article.di

import com.riad804.kotlinnewsapp.article.presentation.ArticleViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val articleModule = module {
    viewModel { ArticleViewModel(get()) }
}