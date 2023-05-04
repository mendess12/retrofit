package com.example.retrofit.services

import com.example.retrofit.model.DataItem
import retrofit2.Call
import retrofit2.http.GET

interface InterfaceAPI {
    @GET("posts")
    fun getData(): Call<List<DataItem>>
}