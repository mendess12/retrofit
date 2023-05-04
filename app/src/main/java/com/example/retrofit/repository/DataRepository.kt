package com.example.retrofit.repository

import androidx.lifecycle.MutableLiveData
import com.example.retrofit.di.NetworkModule
import com.example.retrofit.model.DataItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DataRepository {

    private val networkModule = NetworkModule()

    fun getRetrofitData(dataList: MutableLiveData<List<DataItem>>) {
        networkModule.retrofitData.enqueue(
            object : Callback<List<DataItem>> {
                override fun onResponse(
                    call: Call<List<DataItem>>,
                    response: Response<List<DataItem>>
                ) {
                    if (response.isSuccessful) dataList.value =
                        response.body() else dataList.value = null
                }

                override fun onFailure(call: Call<List<DataItem>>, t: Throwable) {
                    dataList.value = null
                }
            }
        )
    }
}