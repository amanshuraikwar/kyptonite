package io.github.amanshuraikwar.kryptonite.data.db

import androidx.room.*

@Dao
interface ExchangeRateDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(exchangeRateEntity: ExchangeRateEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(exchangeRateEntities: List<ExchangeRateEntity>)

    @Query("SELECT * FROM ExchangeRate")
    fun getAll(): List<ExchangeRateEntity>

    @Query("SELECT * FROM ExchangeRate WHERE sourceCurrencyCode = :source")
    fun getFor(source: String): List<ExchangeRateEntity>

    @Delete
    fun deleteAll(exchangeRateEntities: List<ExchangeRateEntity>)

    @Query("DELETE FROM ExchangeRate WHERE sourceCurrencyCode = :source")
    fun deleteAllFor(source: String)
}