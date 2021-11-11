package com.erick.herrera.pkassessment.feature_card_list.data.remote.dto


import com.google.gson.annotations.SerializedName

data class PageDto(
    @SerializedName("page")
    val page: Page
)

fun PageDto.toCardList(): List<CardData> {

    return page.cards
}