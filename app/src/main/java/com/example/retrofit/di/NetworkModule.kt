package com.example.retrofit.di

import com.example.retrofit.model.DataItem
import com.example.retrofit.services.InterfaceAPI
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkModule {

    private val retrofitBuilder = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(OkHttpClient())
        .build()
        .create(InterfaceAPI::class.java)

    suspend fun retrofitData(): Response<List<DataItem>> = retrofitBuilder.getData()

    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    }
}