package com.erick.herrera.pkassessment.feature_card_list.data.remote.dto


import com.google.gson.annotations.SerializedName

data class AttributesXX(
    @SerializedName("font")
    val font: FontXX,
    @SerializedName("text_color")
    val textColor: String
)