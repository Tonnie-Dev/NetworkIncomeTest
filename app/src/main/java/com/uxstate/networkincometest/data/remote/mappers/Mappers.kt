package com.uxstate.networkincometest.data.remote.mappers

import com.uxstate.networkincometest.data.remote.dto.NetworkIncomeResponseDTO
import com.uxstate.networkincometest.data.remote.dto.ProductDTO
import com.uxstate.networkincometest.domain.model.ReceiptItem.Item
import com.uxstate.networkincometest.domain.model.ReceiptItem.ReceiptItem
import com.uxstate.networkincometest.util.toLocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

//NetworkIncomeResponseDTO to model [ReceiptItem]

fun NetworkIncomeResponseDTO.toModel(): ReceiptItem {

    return ReceiptItem(
            date = this.date.toLocalDate(),
            customerName = this.customer.customerName,
            description = this.description,
            items = List(this.productList.size) { i -> this.productList[i].toItem() },
            totalPrice = this.totalAmount.toBigDecimal(),
            discount = this.discount.toBigDecimal(),
            totalPayable = this.subtotal.toBigDecimal(),
            balance = this.balanceDue.toBigDecimal()
    )

}


//ProductDTO to model [Item]
fun ProductDTO.toItem(): Item {

    return Item(
            productName = this.productName,
            productQuantity = this.productQuantity,
            productPrice = this.productTotalPrice.toBigDecimal()
    )
}



