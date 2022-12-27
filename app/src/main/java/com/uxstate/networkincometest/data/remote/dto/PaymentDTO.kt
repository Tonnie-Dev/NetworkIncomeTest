package com.uxstate.networkincometest.data.remote.dto


import com.squareup.moshi.Json

data class PaymentDTO(
    @Json(name = "payment_amount")
    val paymentAmount: String,
    @Json(name = "payment_date")
    val paymentDate: String,
    @Json(name = "payment_mode")
    val paymentMode: String
)