package com.erick.herrera.pkassessment.feature_card_list.presentation.card_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.erick.herrera.pkassessment.common.Resource
import com.erick.herrera.pkassessment.feature_card_list.domain.use_case.get_cards.GetCardsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject


@HiltViewModel
class CardListViewModel @Inject constructor(
    private val getCardsUseCase: GetCardsUseCase
): ViewModel() {

    private val _state = mutableStateOf(CardListState())
    val state: State<CardListState> = _state

    init {
        getCards()
    }

    private fun getCards(){

        // I can use GetCardsUseCase as a function because of the operator function invoke
        getCardsUseCase().onEach { result ->

            when(result){
                is Resource.Success -> {

                    _state.value = CardListState(cards = result.data ?: emptyList())

                }
                is Resource.Error -> {

                    _state.value = CardListState(error = result.message ?: "An Unexpected error occurred")
                }
                is Resource.Loading -> {

                    _state.value = CardListState(isLoading = true)
                }
            }

        }.launchIn( viewModelScope )
    }
}