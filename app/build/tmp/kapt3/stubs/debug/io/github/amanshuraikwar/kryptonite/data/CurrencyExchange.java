package io.github.amanshuraikwar.kryptonite.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/CurrencyExchange;", "Lio/github/amanshuraikwar/kryptonite/data/Currency;", "code", "", "name", "source", "exchangeRate", "", "lastUpdated", "Lorg/threeten/bp/OffsetDateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLorg/threeten/bp/OffsetDateTime;)V", "getExchangeRate", "()F", "getLastUpdated", "()Lorg/threeten/bp/OffsetDateTime;", "getSource", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
public final class CurrencyExchange extends io.github.amanshuraikwar.kryptonite.data.Currency {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String source = null;
    private final float exchangeRate = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final org.threeten.bp.OffsetDateTime lastUpdated = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSource() {
        return null;
    }
    
    public final float getExchangeRate() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.OffsetDateTime getLastUpdated() {
        return null;
    }
    
    public CurrencyExchange(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String source, float exchangeRate, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.OffsetDateTime lastUpdated) {
        super(null, null);
    }
}