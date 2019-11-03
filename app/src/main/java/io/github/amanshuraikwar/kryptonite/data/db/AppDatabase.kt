package io.github.amanshuraikwar.kryptonite.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

/**
 * The [Room] database for this app.
 */
@Database(
    entities = [AvailableCurrencyEntity::class, ExchangeRateEntity::class],
    version = 2,
    exportSchema = false)
@TypeConverters(io.github.amanshuraikwar.kryptonite.data.db.TypeConverters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun availableCurrencyDao(): AvailableCurrencyDao
    abstract fun exchangeRateDao(): ExchangeRateDao

    companion object {

        private const val databaseName = "kryptonite-db"

        fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, databaseName)
                .fallbackToDestructiveMigration()
                .build()
        }
    }
}