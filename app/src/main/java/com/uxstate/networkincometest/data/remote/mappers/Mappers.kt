package com.uxstate.networkincometest.data.remote.mappers

import com.uxstate.networkincometest.data.remote.dto.NetworkIncomeResponseDTO
import com.uxstate.networkincometest.domain.model.ReceiptItem.ReceiptItem
import java.time.format.DateTimeFormatter
import java.util.*

//NetworkIncomeResponseDTO to model [ReceiptItem]

fun NetworkIncomeResponseDTO.toModel():ReceiptItem{
    
    return ReceiptItem(
            date =,
            customerName = "",
            description = "",
            items = listOf(),
            totalPrice = "",
            discount = "",
            totalPayable = "",
            balance = ""
    )
    
}

//Extension function on String class to LocalDateTime

fun String.toLocalDate(){

    val pattern = "dd:MM:yyyy HH:mm a"
    val dateFormatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())

}

