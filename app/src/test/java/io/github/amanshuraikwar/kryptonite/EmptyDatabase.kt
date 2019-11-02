package io.github.amanshuraikwar.kryptonite

import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.sqlite.db.SupportSQLiteOpenHelper
import io.github.amanshuraikwar.kryptonite.data.db.AppDatabase
import io.github.amanshuraikwar.kryptonite.data.db.AvailableCurrencyDao
import io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateDao
import org.mockito.Mockito

open class EmptyDatabase : AppDatabase() {

    override fun availableCurrencyDao(): AvailableCurrencyDao {
        return Mockito.mock(AvailableCurrencyDao::class.java)
    }

    override fun exchangeRateDao(): ExchangeRateDao {
        return Mockito.mock(ExchangeRateDao::class.java)
    }

    override fun createOpenHelper(config: DatabaseConfiguration?): SupportSQLiteOpenHelper {
        return Mockito.mock(SupportSQLiteOpenHelper::class.java)
    }

    override fun createInvalidationTracker(): InvalidationTracker {
        return Mockito.mock(InvalidationTracker::class.java)
    }

    override fun clearAllTables() {}
}