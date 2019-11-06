package io.github.amanshuraikwar.kryptonite

import io.github.amanshuraikwar.kryptonite.data.db.AvailableCurrencyDao
import io.github.amanshuraikwar.kryptonite.data.db.AvailableCurrencyEntity
import io.github.amanshuraikwar.kryptonite.data.domain.Currency

open class DbWithAvailableCurrencies : EmptyDatabase() {
    override fun availableCurrencyDao(): AvailableCurrencyDao {
        return FakeAvailableCurrencyDao()
    }
}

class FakeAvailableCurrencyDao : AvailableCurrencyDao {

    override fun insert(currencyEntity: AvailableCurrencyEntity) {

    }

    override fun insertAll(currencyEntities: List<AvailableCurrencyEntity>) {

    }

    override fun getAll(): List<AvailableCurrencyEntity> {
        return listOf(
            AvailableCurrencyEntity("SSP", "South Sudanese pound DB"),
            AvailableCurrencyEntity("AED", "United Arab Emirates Dirham DB"),
            AvailableCurrencyEntity("AFN", "Afghan Afghani DB"),
            AvailableCurrencyEntity("USD", "United States Dollar DB")
        )
    }

}