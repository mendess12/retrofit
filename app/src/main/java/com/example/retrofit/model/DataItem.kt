package com.example.retrofit.model

import com.google.gson.annotations.SerializedName

data class DataItem(
    @SerializedName("body")
    val body: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("userId")
    val userId: Int
){
    var expandable : Boolean = false
}