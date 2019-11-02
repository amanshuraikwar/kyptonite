package io.github.amanshuraikwar.kryptonite.ui

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import io.github.amanshuraikwar.kryptonite.di.ViewModelKey

@Module
@Suppress("UNUSED")
abstract class MainModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun bindViewModel(viewModel: MainViewModel): ViewModel
}