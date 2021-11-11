package com.erick.herrera.pkassessment.feature_card_list.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Size(
    @SerializedName("height")
    val height: Int,
    @SerializedName("width")
    val width: Int
)