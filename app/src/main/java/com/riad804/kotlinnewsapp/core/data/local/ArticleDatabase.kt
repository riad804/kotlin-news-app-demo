package com.riad804.kotlinnewsapp.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ArticleEntity::class],
    version = 1
)
abstract class ArticleDatabase: RoomDatabase() {
    abstract val dao: ArticlesDao
}