package com.erick.herrera.pkassessment.feature_card_list.domain.model

import com.erick.herrera.pkassessment.feature_card_list.data.remote.dto.CardX


// I'm not using this class but, I would use it if I need to Format or simplify some Data from the Dto
// so, I would use this class instead of the Dto
data class CardItem( val card: CardX, val cardType: String )
