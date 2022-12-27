package com.uxstate.networkincometest.data.remote.mappers

import com.uxstate.networkincometest.data.remote.dto.NetworkIncomeResponseDTO
import com.uxstate.networkincometest.data.remote.dto.ProductDTO
import com.uxstate.networkincometest.domain.model.ReceiptItem.Item
import com.uxstate.networkincometest.domain.model.ReceiptItem.ReceiptItem
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

//NetworkIncomeResponseDTO to model [ReceiptItem]

fun NetworkIncomeResponseDTO.toModel(): ReceiptItem {

    return ReceiptItem(
            date = this.date.toLocalDate(),
            customerName = this.customer.customerName,
            description = this.description,
            items = List(this.productList.size) { i -> this.productList[i].toItem() },
            totalPrice = this.totalAmount,
            discount = this.discount,
            totalPayable = this.subtotal,
            balance = this.balanceDue
    )

}


//ProductDTO to model [Item]
fun ProductDTO.toItem(): Item {

    return Item(
            productName = this.productName,
            productQuantity = this.productQuantity,
            productPrice = this.productTotalPrice
    )
}

//Extension function on String class to LocalDateTime

fun String.toLocalDate(): LocalDateTime {

    val pattern = "yyyy-MM-ddTHH:mm:ss"
    val dateFormatter = DateTimeFormatter.ofPattern(pattern)
    return LocalDateTime.parse(this, dateFormatter)

}

