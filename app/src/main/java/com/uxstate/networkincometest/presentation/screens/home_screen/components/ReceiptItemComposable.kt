package com.uxstate.networkincometest.presentation.screens.home_screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.uxstate.networkincometest.R
import com.uxstate.networkincometest.domain.model.ReceiptItem
import com.uxstate.networkincometest.util.toHumanDate

@Composable
fun ReceiptItemComposable(receiptItem: ReceiptItem, modifier: Modifier = Modifier) {
    Column(
            modifier = modifier
                    .fillMaxWidth(),

            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
                text = "RECEIPT",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
                text = "Date: ${receiptItem.date.toHumanDate()}",
                style = MaterialTheme.typography.titleLarge
        )
        Text(
                "Customer Name: ${receiptItem.customerName}",
                style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text(
                "Description: ${receiptItem.description}",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text(
                text = "Items Bought",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
        )

        receiptItem.items.forEach { item ->


            Text(
                    text = stringResource(
                            id = R.string.display_dollar,
                            item.productQuantity,
                            item.productName,
                            item.productPrice
                    ),
                    style = MaterialTheme.typography.bodyLarge
            )
        }


        Spacer(modifier = Modifier.height(16.dp))


        Text(
                text = stringResource(
                        id = R.string.display_price, "Total :",
                        receiptItem.totalPrice
                ),
                style = MaterialTheme.typography.titleMedium
        )

        Text(
                text = stringResource(
                        id = R.string.display_price, "Discount:",
                        receiptItem.discount
                ),
                style = MaterialTheme.typography.titleMedium
        )
        Text(
                text = stringResource(
                        id = R.string.display_price, "Received:",
                        receiptItem.totalPayable
                ),
                style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text(
                text = stringResource(
                        id = R.string.display_price, "Balance:",
                        receiptItem.balance
                ),
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(16.dp))

        Divider(thickness = 2.dp)
        Spacer(modifier = Modifier.height(16.dp))
    }
}


