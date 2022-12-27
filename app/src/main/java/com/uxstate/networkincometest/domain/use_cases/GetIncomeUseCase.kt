package com.uxstate.networkincometest.domain.use_cases

import com.uxstate.networkincometest.data.remote.dto.NetworkIncomeResponseDTO
import com.uxstate.networkincometest.domain.repository.IncomeRepository
import com.uxstate.networkincometest.util.Resource
import kotlinx.coroutines.flow.Flow

class GetIncomeUseCase(private val repository: IncomeRepository) {

    operator fun invoke(): Flow<Resource<List<NetworkIncomeResponseDTO>>> {

        return repository.getIncome()
    }
}