package com.erick.herrera.pkassessment.feature_card_list.data.repository

import com.erick.herrera.pkassessment.feature_card_list.data.remote.CardApi
import com.erick.herrera.pkassessment.feature_card_list.data.remote.dto.CardData
import com.erick.herrera.pkassessment.feature_card_list.data.remote.dto.toCardList
import com.erick.herrera.pkassessment.feature_card_list.domain.repository.CardRepository
import javax.inject.Inject

class CardRepositoryImpl @Inject constructor(
    private val api: CardApi
) : CardRepository {

    override suspend fun getCards(): List<CardData> {

        return api.getCards().toCardList()
    }
}