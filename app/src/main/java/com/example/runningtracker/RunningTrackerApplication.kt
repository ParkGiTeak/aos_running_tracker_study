package com.example.runningtracker

import android.app.Application
import com.example.runningtracker.core.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class RunningTrackerApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@RunningTrackerApplication)
            modules(appModule)
        }
    }
}