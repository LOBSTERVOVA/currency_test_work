package com.example.currencytestwork.data.network

import com.example.currencytestwork.data.entity.Entity
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL = "https://www.cbr-xml-daily.ru/"

object RetrofitServices {
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val currencyApi = retrofit.create(CurrencyApi::class.java)
}

interface CurrencyApi{
    @GET("/daily_json.js")
    suspend fun getCurrencies(): Response<Entity>
}