package com.riad804.kotlinnewsapp.news.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.riad804.kotlinnewsapp.core.domain.NewsRepository
import com.riad804.kotlinnewsapp.core.domain.NewsResult
import kotlinx.coroutines.launch

class NewsViewModel(
    private val repository: NewsRepository
): ViewModel() {

    var state by mutableStateOf(NewsState())
        private set

    init {
        loadNews()
    }

    fun onAction(action: NewsAction) {
        when(action) {
            NewsAction.Paginate -> paginate()
        }
    }

    private fun loadNews() {
        viewModelScope.launch {
            state = state.copy(
                isLoading = true
            )

            repository.getNews().collect { newsResult ->
                state = when (newsResult) {
                    is NewsResult.Error -> {
                        state.copy(
                            isLoading = true
                        )
                    }

                    is NewsResult.Success<*> -> {
                        state.copy(
                            isLoading = false,
                            articleList = newsResult.data?.articles ?: emptyList(),
                            nextPage = newsResult.data?.nextPage,
                        )
                    }
                }

                state = state.copy(
                    isLoading = false
                )
            }
        }
    }

    private fun paginate() {
        viewModelScope.launch {
            state = state.copy(
                isLoading = true
            )

            repository.paginate(state.nextPage).collect { newsResult ->
                state = when (newsResult) {
                    is NewsResult.Error -> {
                        state.copy(
                            isLoading = true
                        )
                    }

                    is NewsResult.Success<*> -> {
                        var articles = newsResult.data?.articles ?: emptyList()
                        state.copy(
                            isLoading = false,
                            articleList = state.articleList + articles,
                            nextPage = newsResult.data?.nextPage,
                        )
                    }
                }

                state = state.copy(
                    isLoading = false
                )
            }
        }
    }
}