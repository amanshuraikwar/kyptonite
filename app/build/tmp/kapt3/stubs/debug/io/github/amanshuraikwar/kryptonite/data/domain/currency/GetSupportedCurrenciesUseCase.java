package io.github.amanshuraikwar.kryptonite.data.domain.currency;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/domain/currency/GetSupportedCurrenciesUseCase;", "Lio/github/amanshuraikwar/kryptonite/data/domain/UseCase;", "", "", "Lio/github/amanshuraikwar/kryptonite/data/Currency;", "currencyRepository", "Lio/github/amanshuraikwar/kryptonite/data/CurrencyRepository;", "(Lio/github/amanshuraikwar/kryptonite/data/CurrencyRepository;)V", "execute", "parameters", "(Lkotlin/Unit;)Ljava/util/List;", "app_debug"})
public final class GetSupportedCurrenciesUseCase extends io.github.amanshuraikwar.kryptonite.data.domain.UseCase<kotlin.Unit, java.util.List<? extends io.github.amanshuraikwar.kryptonite.data.Currency>> {
    private final io.github.amanshuraikwar.kryptonite.data.CurrencyRepository currencyRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.util.List<io.github.amanshuraikwar.kryptonite.data.Currency> execute(@org.jetbrains.annotations.NotNull()
    kotlin.Unit parameters) {
        return null;
    }
    
    @javax.inject.Inject()
    public GetSupportedCurrenciesUseCase(@org.jetbrains.annotations.NotNull()
    io.github.amanshuraikwar.kryptonite.data.CurrencyRepository currencyRepository) {
        super();
    }
}