package com.riad804.kotlinnewsapp.core.data.remote


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ArticleDto(
    @SerialName("article_id")
    val articleId: String?,
    @SerialName("title")
    val title: String?,
    @SerialName("description")
    val description: String?,
    @SerialName("content")
    val content: String?,
    @SerialName("pubDate")
    val pubDate: String?,
    @SerialName("source_name")
    val sourceName: String?,
    @SerialName("image_url")
    val imageUrl: String?,
)