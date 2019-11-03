package io.github.amanshuraikwar.kryptonite.data.db;

import java.lang.System;

/**
 * The [Room] database for this app.
 */
@androidx.room.TypeConverters(value = {io.github.amanshuraikwar.kryptonite.data.db.TypeConverters.class})
@androidx.room.Database(entities = {io.github.amanshuraikwar.kryptonite.data.db.AvailableCurrencyEntity.class, io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateEntity.class}, version = 2, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "availableCurrencyDao", "Lio/github/amanshuraikwar/kryptonite/data/db/AvailableCurrencyDao;", "exchangeRateDao", "Lio/github/amanshuraikwar/kryptonite/data/db/ExchangeRateDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.String databaseName = "kryptonite-db";
    public static final io.github.amanshuraikwar.kryptonite.data.db.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.github.amanshuraikwar.kryptonite.data.db.AvailableCurrencyDao availableCurrencyDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateDao exchangeRateDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/db/AppDatabase$Companion;", "", "()V", "databaseName", "", "buildDatabase", "Lio/github/amanshuraikwar/kryptonite/data/db/AppDatabase;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.github.amanshuraikwar.kryptonite.data.db.AppDatabase buildDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}