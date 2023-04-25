package com.example.myapplication.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.model.Contact
import com.example.myapplication.utils.ContactDAO

@Database(entities = [Contact::class], version = 1)
abstract class ContactDatabase : RoomDatabase() {

    abstract fun connectToContactDAO() : ContactDAO
}