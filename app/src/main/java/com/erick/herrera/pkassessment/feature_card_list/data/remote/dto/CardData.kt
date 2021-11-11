package com.erick.herrera.pkassessment.feature_card_list.data.remote.dto


import com.google.gson.annotations.SerializedName

data class CardData(
    @SerializedName("card")
    val card: CardX,
    @SerializedName("card_type")
    val cardType: String
)