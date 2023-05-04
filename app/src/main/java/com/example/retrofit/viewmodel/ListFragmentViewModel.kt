package com.example.retrofit.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.retrofit.model.DataItem
import com.example.retrofit.repository.DataRepository

class ListFragmentViewModel {

    private val repository = DataRepository()
    val dataList = MutableLiveData<List<DataItem>>()

    fun getData() = repository.getRetrofitData(dataList)
}