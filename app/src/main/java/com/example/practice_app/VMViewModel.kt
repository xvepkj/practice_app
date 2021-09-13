package com.example.practice_app

import android.util.Log
import androidx.lifecycle.ViewModel

class VMViewModel : ViewModel() {
    private var _count = 1
    val count : Int
        get() = _count
    fun addOneToCount(){
        _count+=1
    }
    init {
        Log.d("Fragment LifeCycle","viewModel Created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("Fragment LifeCycle","viewModel Destroyed!")
    }
}