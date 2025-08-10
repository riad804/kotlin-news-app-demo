package com.riad804.kotlinnewsapp

import android.app.Application
import com.riad804.kotlinnewsapp.article.di.articleModule
import com.riad804.kotlinnewsapp.core.di.coreModule
import com.riad804.kotlinnewsapp.news.di.newsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(
                coreModule,
                newsModule,
                articleModule,
            )
        }
    }
}