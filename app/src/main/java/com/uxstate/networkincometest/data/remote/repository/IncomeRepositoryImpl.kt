package com.uxstate.networkincometest.data.remote.repository

import com.uxstate.networkincometest.data.remote.api.IncomeAPI
import com.uxstate.networkincometest.data.remote.dto.NetworkIncomeResponseDTO
import com.uxstate.networkincometest.domain.model.ReceiptItem.ReceiptItem
import com.uxstate.networkincometest.domain.repository.IncomeRepository
import com.uxstate.networkincometest.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import timber.log.Timber
import javax.inject.Inject

class IncomeRepositoryImpl @Inject constructor(private val api:IncomeAPI): IncomeRepository{

    override fun getIncome(): Flow<Resource<List<ReceiptItem>>> = flow {

        val response = try {
            api.getAllIncome()
        } catch (e: Exception) {

            e.printStackTrace()
            Timber.i("Funny Error ${e.message}")
            emit(Resource.Error(errorMessage = "Unknown error,  ${e.message}"))
            null
        }

        response?.let {
            Timber.i("Entering null Check")
            emit(Resource.Success(data = response))
        }
    }
}