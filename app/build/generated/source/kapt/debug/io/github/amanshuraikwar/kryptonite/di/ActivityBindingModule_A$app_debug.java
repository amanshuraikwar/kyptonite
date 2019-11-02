package io.github.amanshuraikwar.kryptonite.di;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.github.amanshuraikwar.kryptonite.ui.MainActivity;
import io.github.amanshuraikwar.kryptonite.ui.MainModule;

@Module(subcomponents = ActivityBindingModule_A$app_debug.MainActivitySubcomponent.class)
public abstract class ActivityBindingModule_A$app_debug {
  private ActivityBindingModule_A$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent(modules = MainModule.class)
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
