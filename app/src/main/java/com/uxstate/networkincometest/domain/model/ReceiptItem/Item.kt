package com.uxstate.networkincometest.domain.model.ReceiptItem

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Item(
    val productName: String,
    val productQuantity: Int,
    val productPrice: String
) : Parcelable
