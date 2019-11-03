package io.github.amanshuraikwar.kryptonite.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\'J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/db/ExchangeRateDao;", "", "deleteAll", "", "exchangeRateEntities", "", "Lio/github/amanshuraikwar/kryptonite/data/db/ExchangeRateEntity;", "deleteAllFor", "source", "", "getAll", "getFor", "insert", "exchangeRateEntity", "insertAll", "app_debug"})
public abstract interface ExchangeRateDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateEntity exchangeRateEntity);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateEntity> exchangeRateEntities);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ExchangeRate")
    public abstract java.util.List<io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateEntity> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ExchangeRate WHERE sourceCurrencyCode = :source")
    public abstract java.util.List<io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateEntity> getFor(@org.jetbrains.annotations.NotNull()
    java.lang.String source);
    
    @androidx.room.Delete()
    public abstract void deleteAll(@org.jetbrains.annotations.NotNull()
    java.util.List<io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateEntity> exchangeRateEntities);
    
    @androidx.room.Query(value = "DELETE FROM ExchangeRate WHERE sourceCurrencyCode = :source")
    public abstract void deleteAllFor(@org.jetbrains.annotations.NotNull()
    java.lang.String source);
}