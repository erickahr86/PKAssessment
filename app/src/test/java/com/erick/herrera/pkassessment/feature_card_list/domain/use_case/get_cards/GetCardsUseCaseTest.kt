package com.erick.herrera.pkassessment.feature_card_list.domain.use_case.get_cards

import com.erick.herrera.pkassessment.common.Resource
import com.erick.herrera.pkassessment.feature_card_list.data.repository.TestCardRepository
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class GetCardsUseCaseTest {

    private lateinit var getCards: GetCardsUseCase
    private lateinit var testCardRepository: TestCardRepository

    @Before
    fun setUp() {

        testCardRepository = TestCardRepository()
        getCards = GetCardsUseCase(testCardRepository)
    }

    @Test
    fun `Get Cards`() = runBlocking {


//            when (val result = getCards().first() ) {
//                is Resource.Success -> Assert.assertTrue(result.data?.size!! > 0)
//                is Resource.Error -> TODO()
//                is Resource.Loading -> TODO()
//            }

    }

}