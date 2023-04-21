package com.example.architecturecomponent.view_model

import androidx.lifecycle.ViewModel
import com.example.architecturecomponent.model.Quotes

class MainViewModel(val increamentCount: Int): ViewModel() {
    var count: Int = increamentCount

    val quotesData = Quotes("Fact one data", "Rajan", "https://picsum.photos/400")
}