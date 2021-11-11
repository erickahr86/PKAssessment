package com.erick.herrera.pkassessment.feature_card_list.domain.use_case.get_cards

import com.erick.herrera.pkassessment.common.Resource
import com.erick.herrera.pkassessment.feature_card_list.data.remote.dto.CardData
import com.erick.herrera.pkassessment.feature_card_list.domain.repository.CardRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetCardsUseCase @Inject constructor(
    private val repository: CardRepository
) {

    operator fun invoke(): Flow<Resource<List<CardData>>> = flow {

        try {

            emit(Resource.Loading<List<CardData>>())

            val cards = repository.getCards()
            emit(Resource.Success<List<CardData>>(cards))

        } catch (e: HttpException) {

            emit(Resource.Error<List<CardData>>(e.localizedMessage ?: "An unexpected error ocurred"))

        } catch (e: IOException) {

            emit(Resource.Error<List<CardData>>("Could't reach server"))

        }
    }
}