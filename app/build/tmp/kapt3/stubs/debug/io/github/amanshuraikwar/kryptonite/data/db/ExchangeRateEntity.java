package io.github.amanshuraikwar.kryptonite.data.db;

import java.lang.System;

@androidx.room.Entity(tableName = "ExchangeRate")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/db/ExchangeRateEntity;", "", "id", "", "sourceCurrencyCode", "", "currencyCode", "exchangeRate", "", "lastUpdated", "Lorg/threeten/bp/OffsetDateTime;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;FLorg/threeten/bp/OffsetDateTime;)V", "getCurrencyCode", "()Ljava/lang/String;", "getExchangeRate", "()F", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastUpdated", "()Lorg/threeten/bp/OffsetDateTime;", "getSourceCurrencyCode", "app_debug"})
public final class ExchangeRateEntity {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sourceCurrencyCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currencyCode = null;
    private final float exchangeRate = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final org.threeten.bp.OffsetDateTime lastUpdated = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSourceCurrencyCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrencyCode() {
        return null;
    }
    
    public final float getExchangeRate() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.OffsetDateTime getLastUpdated() {
        return null;
    }
    
    public ExchangeRateEntity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceCurrencyCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, float exchangeRate, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.OffsetDateTime lastUpdated) {
        super();
    }
}