// Generated by Dagger (https://dagger.dev).
package io.github.amanshuraikwar.kryptonite.di;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class KryptoniteViewModelFactory_Factory implements Factory<KryptoniteViewModelFactory> {
  private final Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider;

  public KryptoniteViewModelFactory_Factory(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider) {
    this.creatorsProvider = creatorsProvider;
  }

  @Override
  public KryptoniteViewModelFactory get() {
    return new KryptoniteViewModelFactory(creatorsProvider.get());
  }

  public static KryptoniteViewModelFactory_Factory create(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider) {
    return new KryptoniteViewModelFactory_Factory(creatorsProvider);
  }

  public static KryptoniteViewModelFactory newInstance(
      Map<Class<? extends ViewModel>, Provider<ViewModel>> creators) {
    return new KryptoniteViewModelFactory(creators);
  }
}