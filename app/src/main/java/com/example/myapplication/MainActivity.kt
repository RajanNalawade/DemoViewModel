package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.myapplication.database.ContactDatabase
import com.example.myapplication.model.Contact
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var db : ContactDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db = ContactDatabase.getContactDB(this)

        GlobalScope.launch {
            db.connectToContactDAO().insertContact(Contact( 0, "A" ,"a@gmail.com"))
        }
    }

    fun onIncrement(mView: View){
        db.connectToContactDAO().getContact().observe(this, Observer {
            Log.d("rajan", "onIncrement: ${it.toString()}")
        })
    }
}