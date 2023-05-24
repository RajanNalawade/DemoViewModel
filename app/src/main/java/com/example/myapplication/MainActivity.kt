package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.model.Note

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    fun onClickAddNote(view: View){
        val title = binding.edtTitle.text?.toString() ?: ""
        val description = binding.edtDescription.text?.toString() ?: ""

        // start your activity by passing the intent
        startActivity(Intent(this, DescriptionActivity::class.java).apply {
            // you can add values(if any) to pass to the next class or avoid using `.apply`
            putExtra("title",title)
            putExtra("desc", description)
        })
    }
}