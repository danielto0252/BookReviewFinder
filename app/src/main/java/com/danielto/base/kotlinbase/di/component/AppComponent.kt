package com.danielto.base.kotlinbase.di.component

import android.app.Application
import com.danielto.base.kotlinbase.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: Application)
}
