package com.uxstate.networkincometest.domain.repository

import com.uxstate.networkincometest.domain.model.ReceiptItem
import com.uxstate.networkincometest.util.Resource
import kotlinx.coroutines.flow.Flow

interface IncomeRepository {
    fun getIncome(): Flow<Resource<List<ReceiptItem>>>
}