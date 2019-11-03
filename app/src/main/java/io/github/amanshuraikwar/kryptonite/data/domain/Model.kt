package io.github.amanshuraikwar.kryptonite.data.domain

import org.threeten.bp.OffsetDateTime

/**
 * Signifies a currency.
 */
open class Currency(
    val code: String,
    val name: String
) {
    override fun toString(): String {
        return "Currency(code='$code', name='$name')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Currency) return false

        if (code != other.code) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = code.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }
}

/**
 * Signifies an exchange rate.
 */
class Exchange(
    val sourceCode: String,
    val code: String,
    val rate: Float
)

/**
 * Signifies a currency exchange.
 */
class CurrencyExchange(
    code: String,
    name: String,
    val source: String,
    val exchangeRate: Float,
    val lastUpdated: OffsetDateTime
) : Currency(
    code,
    name
) {
    override fun toString(): String {
        return "CurrencyExchange(source='$source', exchangeRate=$exchangeRate, lastUpdated=$lastUpdated) ${super.toString()}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CurrencyExchange) return false
        if (!super.equals(other)) return false

        if (source != other.source) return false
        if (exchangeRate != other.exchangeRate) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + source.hashCode()
        result = 31 * result + exchangeRate.hashCode()
        return result
    }
}