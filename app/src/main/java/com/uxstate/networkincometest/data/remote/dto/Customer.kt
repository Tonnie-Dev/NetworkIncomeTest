package com.uxstate.networkincometest.data.remote.dto


import com.squareup.moshi.Json

data class Customer(
    @Json(name = "customer_name")
    val customerName: String,
    @Json(name = "customer_phone")
    val customerPhone: String
)