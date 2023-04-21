package com.example.architecturecomponent.view

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.architecturecomponent.MainViewModelFactory
import com.example.architecturecomponent.R
import com.example.architecturecomponent.databinding.ActivityMainBinding
import com.example.architecturecomponent.view_model.MainViewModel

class MainActivity : AppCompatActivity() {
    lateinit var txtCount : TextView
    lateinit var mMainViewModel: MainViewModel

    lateinit var mBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //setContentView(R.layout.activity_main)
        mMainViewModel = ViewModelProvider(this, MainViewModelFactory(30)).get(MainViewModel::class.java)
        //val quotesData = Quotes("Fact one data", "Rajan")
        //mBinding.txtAuthor.text = mMainViewModel.quotesData.strAuthor
        //mBinding.txtQuote.text = mMainViewModel.quotesData.strQuotes
        mBinding.objQuotes = mMainViewModel.quotesData


    }
}