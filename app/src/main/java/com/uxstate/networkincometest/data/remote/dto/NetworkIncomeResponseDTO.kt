package com.uxstate.networkincometest.data.remote.dto


import com.squareup.moshi.Json

data class NetworkIncomeResponseDTO(
    @Json(name = "amount_received")
    val amountReceived: String,
    @Json(name = "balance_due")
    val balanceDue: String,
    @Json(name = "customer")
    val customer: Customer,
    @Json(name = "date")
    val date: String,
    @Json(name = "description")
    val description: String,
    @Json(name = "discount")
    val discount: String,
    @Json(name = "payment_list")
    val paymentList: List<Payment>,
    @Json(name = "product_list")
    val productList: List<Product>,
    @Json(name = "record_id")
    val recordId: String,
    @Json(name = "subtotal")
    val subtotal: String,
    @Json(name = "total_amount")
    val totalAmount: String
)