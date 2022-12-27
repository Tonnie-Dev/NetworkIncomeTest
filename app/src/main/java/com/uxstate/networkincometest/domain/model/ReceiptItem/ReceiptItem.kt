package com.uxstate.networkincometest.domain.model.ReceiptItem

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDate
import java.time.LocalDateTime

@Parcelize
data class ReceiptItem(
    val date: LocalDateTime,
    val customerName: String,
    val description: String,
    val items: List<Item>,
    val totalPrice: String,
    val discount: String,
    val totalPayable: String,
    val balance: String
) : Parcelable