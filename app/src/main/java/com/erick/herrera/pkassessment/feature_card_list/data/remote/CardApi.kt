package com.erick.herrera.pkassessment.feature_card_list.data.remote

import com.erick.herrera.pkassessment.feature_card_list.data.remote.dto.PageDto
import retrofit2.http.GET

interface CardApi {

    @GET("test/home")
    suspend fun getCards(): PageDto
}