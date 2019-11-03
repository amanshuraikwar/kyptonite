package io.github.amanshuraikwar.kryptonite

import io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateDao
import io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateEntity
import org.threeten.bp.OffsetDateTime

class DbWithAvailableCurrenciesAndExchangeRates(
    private val now: OffsetDateTime
) : DbWithAvailableCurrencies() {
    override fun exchangeRateDao(): ExchangeRateDao {
        return FakeExchangeRateDao(now)
    }
}

class FakeExchangeRateDao(
    private val now: OffsetDateTime
) : ExchangeRateDao {

    override fun insert(exchangeRateEntity: ExchangeRateEntity) {

    }

    override fun insertAll(exchangeRateEntities: List<ExchangeRateEntity>) {

    }

    override fun getAll(): List<ExchangeRateEntity> {
        return getFor("")
    }

    override fun getFor(source: String): List<ExchangeRateEntity> {
        return listOf(
            ExchangeRateEntity(
                0,
                "USD",
                "ALL",
                4.23f,
                now
            ),
            ExchangeRateEntity(
                0,
                "USD",
                "AMD",
                5.2398f,
                now
            )
        )
    }

    override fun deleteAll(exchangeRateEntities: List<ExchangeRateEntity>) {

    }

    override fun deleteAllFor(source: String) {

    }
}
