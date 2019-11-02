// Generated by Dagger (https://dagger.dev).
package io.github.amanshuraikwar.kryptonite.data.domain.currency;

import dagger.internal.Factory;
import io.github.amanshuraikwar.kryptonite.data.CurrencyRepository;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetExchangeRatesUseCase_Factory implements Factory<GetExchangeRatesUseCase> {
  private final Provider<CurrencyRepository> currencyRepositoryProvider;

  public GetExchangeRatesUseCase_Factory(Provider<CurrencyRepository> currencyRepositoryProvider) {
    this.currencyRepositoryProvider = currencyRepositoryProvider;
  }

  @Override
  public GetExchangeRatesUseCase get() {
    return new GetExchangeRatesUseCase(currencyRepositoryProvider.get());
  }

  public static GetExchangeRatesUseCase_Factory create(
      Provider<CurrencyRepository> currencyRepositoryProvider) {
    return new GetExchangeRatesUseCase_Factory(currencyRepositoryProvider);
  }

  public static GetExchangeRatesUseCase newInstance(CurrencyRepository currencyRepository) {
    return new GetExchangeRatesUseCase(currencyRepository);
  }
}