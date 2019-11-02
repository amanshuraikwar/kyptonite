package io.github.amanshuraikwar.kryptonite

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.github.amanshuraikwar.kryptonite.di.DaggerAppComponent

class MainApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }
}