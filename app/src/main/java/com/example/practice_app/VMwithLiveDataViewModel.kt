package com.example.practice_app

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VMwithLiveDataViewModel : ViewModel() {
    private var _count : MutableLiveData<Int> = MutableLiveData(1)
    val count : LiveData<Int>
        get() = _count
    fun addOneToCount(){
        _count.value = _count.value?.plus(1)
    }
}