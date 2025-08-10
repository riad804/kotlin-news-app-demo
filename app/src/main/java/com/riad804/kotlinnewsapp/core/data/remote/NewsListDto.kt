package com.riad804.kotlinnewsapp.core.data.remote


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NewsListDto(
    @SerialName("nextPage")
    val nextPage: String?,
    @SerialName("results")
    val results: List<ArticleDto>?
)