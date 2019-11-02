package io.github.amanshuraikwar.kryptonite.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "AvailableCurrency")
class AvailableCurrencyEntity(
    @PrimaryKey val code: String,
    val name: String
)