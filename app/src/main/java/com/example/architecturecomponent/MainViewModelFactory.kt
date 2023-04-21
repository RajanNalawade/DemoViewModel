package com.example.architecturecomponent

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.architecturecomponent.view_model.MainViewModel

class MainViewModelFactory(val count: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(count) as T
    }
}