package com.example.architecturecomponent.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.architecturecomponent.model.Quotes

class LiveDataBindingViewModel : ViewModel() {

    val quoteLiveData = MutableLiveData<Quotes>(Quotes("quote of live data binding", "04-04-2023", "https://picsum.photos/200"))

    fun updateQuotes(){
        quoteLiveData.value = Quotes("updated quote of live data binding", "another date", "https://picsum.photos/300")
    }
}