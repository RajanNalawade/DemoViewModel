package com.example.myapplication.view_model

import androidx.lifecycle.ViewModel
import com.example.myapplication.model.Quotes

class MainViewModel(val increamentCount: Int): ViewModel() {
    var count: Int = increamentCount

    val quotesData = Quotes("Fact one data", "Rajan")
}