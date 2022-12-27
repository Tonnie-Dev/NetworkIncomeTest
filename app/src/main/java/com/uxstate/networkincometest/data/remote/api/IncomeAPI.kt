package com.uxstate.networkincometest.data.remote.api

import com.uxstate.networkincometest.data.remote.dto.NetworkIncomeResponseDTO
import com.uxstate.networkincometest.util.Constants.GET_INCOME_ENDPOINT
import retrofit2.http.GET

interface IncomeAPI {
        @GET(GET_INCOME_ENDPOINT)
        suspend fun getAllIncome(): List<NetworkIncomeResponseDTO>
}