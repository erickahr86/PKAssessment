package com.erick.herrera.pkassessment.feature_card_list.data.remote.dto


import com.google.gson.annotations.SerializedName

data class AttributesX(
    @SerializedName("font")
    val font: FontX,
    @SerializedName("text_color")
    val textColor: String
)