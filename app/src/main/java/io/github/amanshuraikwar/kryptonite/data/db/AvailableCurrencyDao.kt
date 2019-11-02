package io.github.amanshuraikwar.kryptonite.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface AvailableCurrencyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(currencyEntity: AvailableCurrencyEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(currencyEntities: List<AvailableCurrencyEntity>)

    @Query("SELECT * FROM AvailableCurrency")
    fun getAll(): List<AvailableCurrencyEntity>

}