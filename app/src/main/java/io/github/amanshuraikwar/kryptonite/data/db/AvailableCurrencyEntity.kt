package io.github.amanshuraikwar.kryptonite.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Store available currencies locally.
 */
@Entity(tableName = "AvailableCurrency")
class AvailableCurrencyEntity(
    @PrimaryKey val code: String,
    val name: String
)
