package com.danielto.base.kotlinbase.ui

import android.app.Application
import com.danielto.base.kotlinbase.di.component.DaggerAppComponent
import com.danielto.base.kotlinbase.di.module.AppModule
import timber.log.Timber

class MyApplication : Application() {

    val component by lazy {
        DaggerAppComponent
            .builder()
            .appModule(AppModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
//        component.inject(this)
        Timber.plant(Timber.DebugTree())
    }
}
