package com.erick.herrera.pkassessment.feature_card_list.data.repository

import com.erick.herrera.pkassessment.feature_card_list.data.remote.dto.*
import com.erick.herrera.pkassessment.feature_card_list.domain.repository.CardRepository

class TestCardRepository : CardRepository {

    private val cards = mutableListOf<CardData>()

    override suspend fun getCards(): List<CardData>{

        // This is a Workarround for time Issue,
        // but here we can create a complex test matrix for needed validations
        cards.add(
            CardData(
                card = CardX(
                    Attributes(
                        font = Font(18),
                        textColor = "#000"
                    ),
                    Description(
                        attributes = AttributesX(
                            font = FontX(18),
                            textColor = "#000"
                        ),
                        value = "description"
                    ),
                    Image(
                        size = Size(
                            height = 720,
                            width = 480
                        ),
                        url = "https://qaevolution.blob.core.windows.net/assets/ios/3x/Featured@4.76x.png"
                    ),
                    Title(
                        value = "Title",
                        attributes = AttributesXX(
                            font = FontXX(18),
                            textColor = "#000"
                        )
                    ),
                    "someValue"
                ), "cardType"
            )
        )

        return cards
    }
}