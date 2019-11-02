package io.github.amanshuraikwar.kryptonite.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'J\u0016\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\n"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/db/AvailableCurrencyDao;", "", "getAll", "", "Lio/github/amanshuraikwar/kryptonite/data/db/AvailableCurrencyEntity;", "insert", "", "currencyEntity", "insertAll", "currencyEntities", "app_debug"})
public abstract interface AvailableCurrencyDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    io.github.amanshuraikwar.kryptonite.data.db.AvailableCurrencyEntity currencyEntity);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<io.github.amanshuraikwar.kryptonite.data.db.AvailableCurrencyEntity> currencyEntities);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM AvailableCurrency")
    public abstract java.util.List<io.github.amanshuraikwar.kryptonite.data.db.AvailableCurrencyEntity> getAll();
}