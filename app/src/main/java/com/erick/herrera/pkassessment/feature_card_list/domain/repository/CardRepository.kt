package com.erick.herrera.pkassessment.feature_card_list.domain.repository

import com.erick.herrera.pkassessment.feature_card_list.data.remote.dto.CardData

interface CardRepository {

    suspend fun getCards(): List<CardData>
}