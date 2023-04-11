package com.example.myapplication.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityLiveDataBindingBinding
import com.example.myapplication.view_model.LiveDataBindingViewModel

class ActivityLiveDataBinding : AppCompatActivity() {
    lateinit var liveDataBindingViewModel: LiveDataBindingViewModel
    lateinit var binding: ActivityLiveDataBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_live_data_binding)
        liveDataBindingViewModel= ViewModelProvider(this).get(LiveDataBindingViewModel::class.java)

        binding.viewModel = liveDataBindingViewModel

        //use this when you use livedata in to the binding
        binding.lifecycleOwner = this
    }
}