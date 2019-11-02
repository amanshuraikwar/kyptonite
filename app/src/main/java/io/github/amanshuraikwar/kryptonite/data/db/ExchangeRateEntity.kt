package io.github.amanshuraikwar.kryptonite.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.threeten.bp.OffsetDateTime

@Entity(tableName = "ExchangeRate")
class ExchangeRateEntity(
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    val sourceCurrencyCode: String,
    val currencyCode: String,
    val exchangeRate: Float,
    val lastUpdated: OffsetDateTime
)
