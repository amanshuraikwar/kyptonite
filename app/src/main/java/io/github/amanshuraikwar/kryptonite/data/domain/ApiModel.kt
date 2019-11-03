package io.github.amanshuraikwar.kryptonite.data.domain

import com.google.gson.JsonObject

open class BaseApiResponse(
    val success: Boolean,
    val terms: String,
    val privacy: String,
    val error: Error? = null
)

class ListResponse(
    success: Boolean,
    terms: String,
    privacy: String,
    error: Error? = null,
    val currencies: JsonObject
) : BaseApiResponse(
    success,
    terms,
    privacy,
    error
)

class LiveResponse(
    success: Boolean,
    terms: String,
    privacy: String,
    error: Error? = null,
    val timestamp: Long,
    val source: String,
    val quotes: JsonObject
) : BaseApiResponse(
    success,
    terms,
    privacy,
    error
)

data class Error(
    val code: Int,
    val info: String
)