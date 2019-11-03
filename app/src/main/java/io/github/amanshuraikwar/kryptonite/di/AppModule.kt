package io.github.amanshuraikwar.kryptonite.di

import android.content.Context
import dagger.Module
import dagger.Provides
import io.github.amanshuraikwar.kryptonite.MainApplication
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    fun provideContext(application: MainApplication): Context {
        return application.applicationContext
    }

}