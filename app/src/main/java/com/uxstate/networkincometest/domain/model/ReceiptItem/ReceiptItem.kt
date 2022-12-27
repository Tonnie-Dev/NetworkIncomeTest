package com.uxstate.networkincometest.domain.model.ReceiptItem

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDate

@Parcelize
data class ReceiptItem(val date:LocalDate,val customerName:String,val description:String, val items:List<Item>):Parcelable