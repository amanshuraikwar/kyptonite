package io.github.amanshuraikwar.kryptonite.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.github.amanshuraikwar.kryptonite.ui.MainActivity
import io.github.amanshuraikwar.kryptonite.ui.MainModule

@Module
@Suppress("UNUSED")
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [MainModule::class])
    internal abstract fun a(): MainActivity

}