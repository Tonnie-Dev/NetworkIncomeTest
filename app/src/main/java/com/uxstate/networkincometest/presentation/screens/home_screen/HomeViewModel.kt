package com.uxstate.networkincometest.presentation.screens.home_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.uxstate.networkincometest.domain.use_cases.UseCaseContainer
import com.uxstate.networkincometest.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val container: UseCaseContainer) : ViewModel() {
    private val _state = MutableStateFlow("")
    val state = _state.asStateFlow()

    init {
        getIncome()
    }


    private fun getIncome() {

        container.getIncomeUseCase()
                .onEach {

                    result ->

                    when (result) {

                        is Resource.Success -> {
                            _state.value = "Success, payment is ${result.data}"

                        }
                        is Resource.Error -> {
                            _state.value = "Success, payment is ${result.data}"

                        }
                        is Resource.Loading -> {}
                    }
                }
                .launchIn(viewModelScope)
    }
}