package com.example.retrofit.services

import com.example.retrofit.model.DataItem
import retrofit2.Response
import retrofit2.http.GET

interface InterfaceAPI {
    @GET("posts")
    suspend fun getData(): Response<List<DataItem>>
}