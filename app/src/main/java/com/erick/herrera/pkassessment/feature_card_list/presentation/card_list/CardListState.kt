package com.erick.herrera.pkassessment.feature_card_list.presentation.card_list

import com.erick.herrera.pkassessment.feature_card_list.data.remote.dto.CardData

data class CardListState(
    val isLoading: Boolean = false,
    val cards: List<CardData> = emptyList(),
    val error: String = ""
)

