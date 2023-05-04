package com.example.retrofit.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.retrofit.model.DataItem
import com.example.retrofit.repository.DataRepository

class ListFragmentViewModel : ViewModel() {

    private val repository = DataRepository()
    val dataList = MutableLiveData<List<DataItem>>()

    fun getData() = repository.getRetrofitData(dataList)
}