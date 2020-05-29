package com.theapache64.cleancorn

import android.app.Application
import com.theapache64.cleancorn.data.di.networkModule
import com.theapache64.cleancorn.data.di.repoModule
import com.theapache64.cleancorn.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(applicationContext)
            modules(
                networkModule,
                viewModelModule,
                repoModule
            )
        }
    }
}