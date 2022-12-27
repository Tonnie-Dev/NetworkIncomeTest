package com.uxstate.networkincometest.domain.model

import android.os.Parcelable
import com.uxstate.networkincometest.domain.model.Item
import kotlinx.parcelize.Parcelize
import java.math.BigDecimal
import java.time.LocalDateTime

@Parcelize
data class ReceiptItem(
    val date: LocalDateTime,
    val customerName: String,
    val description: String,
    val items: List<Item>,
    val totalPrice:BigDecimal,
    val discount: BigDecimal,
    val totalPayable: BigDecimal,
    val balance: BigDecimal
) : Parcelable