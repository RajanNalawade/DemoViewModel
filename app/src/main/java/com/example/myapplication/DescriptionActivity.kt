package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.ActivityDescriptionBinding
import com.example.myapplication.model.Note

class DescriptionActivity : AppCompatActivity() {

    lateinit var binding: ActivityDescriptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_description)

        val title = intent.getStringExtra("title")!!
        val desc = intent.getStringExtra("desc")!!

        binding.desc = Note(title, desc)

    }
}