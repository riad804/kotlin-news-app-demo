package com.riad804.kotlinnewsapp.core.data.local

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface ArticlesDao {
    @Query("SELECT * FROM articleentity")
    suspend fun getArticleList(): List<ArticleEntity>

    @Upsert
    suspend fun upsertArticles(articles: List<ArticleEntity>)

    @Query("SELECT * FROM articleentity WHERE articleId == :articleId")
    suspend fun getArticle(articleId: String): ArticleEntity?

    @Query("DELETE FROM articleentity")
    suspend fun clearArticles()
}