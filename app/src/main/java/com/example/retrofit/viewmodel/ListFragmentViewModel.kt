package com.example.retrofit.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit.model.DataItem
import com.example.retrofit.repository.DataRepository
import kotlinx.coroutines.launch
import java.lang.Exception

class ListFragmentViewModel : ViewModel() {

    private val repository = DataRepository()
    val dataList = MutableLiveData<List<DataItem>?>()

    fun getData() {
        viewModelScope.launch {
            try {
                val result = repository.getRetrofitData()
                if (result.isSuccessful){
                    dataList.postValue(result.body())
                }else {
                    dataList.postValue( null)
                }
                Log.d("message", result.toString())
            }catch (e:Exception){
                dataList.postValue( null)
            }
        }
    }
}