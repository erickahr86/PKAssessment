package com.erick.herrera.pkassessment.feature_card_list.data.remote.dto


import com.google.gson.annotations.SerializedName

data class CardX(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("description")
    val description: Description,
    @SerializedName("image")
    val image: Image,
    @SerializedName("title")
    val title: Title,
    @SerializedName("value")
    val value: String
)