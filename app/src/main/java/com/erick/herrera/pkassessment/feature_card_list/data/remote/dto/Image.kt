package com.erick.herrera.pkassessment.feature_card_list.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("size")
    val size: Size,
    @SerializedName("url")
    val url: String
)