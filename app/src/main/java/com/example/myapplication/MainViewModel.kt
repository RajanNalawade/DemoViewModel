package com.example.myapplication

import androidx.lifecycle.ViewModel

class MainViewModel(val increamentCount: Int): ViewModel() {
    var count: Int = increamentCount

    fun increamentCount(){
        count++
    }
}