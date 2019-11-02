package io.github.amanshuraikwar.kryptonite.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
@Suppress("UNUSED")
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: KryptoniteViewModelFactory):
            ViewModelProvider.Factory
}