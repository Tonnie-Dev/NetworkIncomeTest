package com.uxstate.networkincometest.presentation.screens.home_screen

import com.uxstate.networkincometest.domain.model.ReceiptItem

data class ReceiptState(
    val isLoading: Boolean = false,
    val errorMessage: String = "",
    val receipts: List<ReceiptItem> = listOf()
)