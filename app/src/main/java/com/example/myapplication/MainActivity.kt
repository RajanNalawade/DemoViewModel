package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var txtCount : TextView
    lateinit var mMainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMainViewModel = ViewModelProvider(this, MainViewModelFactory(30)).get(MainViewModel::class.java)

        txtCount = findViewById(R.id.txtCount)
        txtCount.text = mMainViewModel.count.toString()
    }

    fun onIncrement(mView: View) {
        mMainViewModel.increamentCount()
    }
}