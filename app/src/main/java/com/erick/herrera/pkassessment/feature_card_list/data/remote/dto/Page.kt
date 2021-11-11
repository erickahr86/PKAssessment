package com.erick.herrera.pkassessment.feature_card_list.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Page(
    @SerializedName("cards")
    val cards: List<CardData>
)