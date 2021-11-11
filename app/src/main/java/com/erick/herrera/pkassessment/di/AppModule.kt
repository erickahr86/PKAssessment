package com.erick.herrera.pkassessment.di

import com.erick.herrera.pkassessment.common.Constants.BASE_URL
import com.erick.herrera.pkassessment.feature_card_list.data.remote.CardApi
import com.erick.herrera.pkassessment.feature_card_list.data.repository.CardRepositoryImpl
import com.erick.herrera.pkassessment.feature_card_list.domain.repository.CardRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providerCardsApi(): CardApi {

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CardApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCardRepository(api: CardApi): CardRepository {
        return CardRepositoryImpl(api)
    }


}