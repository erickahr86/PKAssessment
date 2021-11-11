package com.erick.herrera.pkassessment.feature_card_list.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Description(
    @SerializedName("attributes")
    val attributes: AttributesX,
    @SerializedName("value")
    val value: String
)