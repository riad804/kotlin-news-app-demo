package com.riad804.kotlinnewsapp

import android.app.Application
import com.riad804.kotlinnewsapp.core.di.coreModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(coreModule)
        }
    }
}