package com.erick.herrera.pkassessment.feature_card_list.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Title(
    @SerializedName("attributes")
    val attributes: AttributesXX,
    @SerializedName("value")
    val value: String
)