package com.example.myapplication.view

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.MainViewModelFactory
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.view_model.MainViewModel

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