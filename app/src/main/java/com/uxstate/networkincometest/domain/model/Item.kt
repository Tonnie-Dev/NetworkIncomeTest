package com.uxstate.networkincometest.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.math.BigDecimal

@Parcelize
data class Item(
    val productName: String,
    val productQuantity: Int,
    val productPrice: BigDecimal
) : Parcelable
