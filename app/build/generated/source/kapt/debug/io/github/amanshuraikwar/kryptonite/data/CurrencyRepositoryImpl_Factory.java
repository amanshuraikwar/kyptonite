// Generated by Dagger (https://dagger.dev).
package io.github.amanshuraikwar.kryptonite.data;

import dagger.internal.Factory;
import io.github.amanshuraikwar.kryptonite.data.db.AppDatabase;
import io.github.amanshuraikwar.kryptonite.data.db.AvailableCurrencyDao;
import io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateDao;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CurrencyRepositoryImpl_Factory implements Factory<CurrencyRepositoryImpl> {
  private final Provider<CurrencyLayerApi> apiProvider;

  private final Provider<AppDatabase> appDatabaseProvider;

  private final Provider<AvailableCurrencyDao> availableCurrencyDaoProvider;

  private final Provider<ExchangeRateDao> exchangeRateDaoProvider;

  public CurrencyRepositoryImpl_Factory(Provider<CurrencyLayerApi> apiProvider,
      Provider<AppDatabase> appDatabaseProvider,
      Provider<AvailableCurrencyDao> availableCurrencyDaoProvider,
      Provider<ExchangeRateDao> exchangeRateDaoProvider) {
    this.apiProvider = apiProvider;
    this.appDatabaseProvider = appDatabaseProvider;
    this.availableCurrencyDaoProvider = availableCurrencyDaoProvider;
    this.exchangeRateDaoProvider = exchangeRateDaoProvider;
  }

  @Override
  public CurrencyRepositoryImpl get() {
    return new CurrencyRepositoryImpl(apiProvider.get(), appDatabaseProvider.get(), availableCurrencyDaoProvider.get(), exchangeRateDaoProvider.get());
  }

  public static CurrencyRepositoryImpl_Factory create(Provider<CurrencyLayerApi> apiProvider,
      Provider<AppDatabase> appDatabaseProvider,
      Provider<AvailableCurrencyDao> availableCurrencyDaoProvider,
      Provider<ExchangeRateDao> exchangeRateDaoProvider) {
    return new CurrencyRepositoryImpl_Factory(apiProvider, appDatabaseProvider, availableCurrencyDaoProvider, exchangeRateDaoProvider);
  }

  public static CurrencyRepositoryImpl newInstance(CurrencyLayerApi api, AppDatabase appDatabase,
      AvailableCurrencyDao availableCurrencyDao, ExchangeRateDao exchangeRateDao) {
    return new CurrencyRepositoryImpl(api, appDatabase, availableCurrencyDao, exchangeRateDao);
  }
}