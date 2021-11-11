package com.erick.herrera.pkassessment.feature_card_list.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("font")
    val font: Font,
    @SerializedName("text_color")
    val textColor: String
)