package io.github.amanshuraikwar.kryptonite

import io.github.amanshuraikwar.kryptonite.data.db.AvailableCurrencyDao
import io.github.amanshuraikwar.kryptonite.data.db.AvailableCurrencyEntity

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
            AvailableCurrencyEntity("ALL", "Albanian Lek"),
            AvailableCurrencyEntity("AMD", "Armenian Dram")
        )
    }

}