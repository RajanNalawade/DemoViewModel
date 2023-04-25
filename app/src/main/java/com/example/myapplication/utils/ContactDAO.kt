package com.example.myapplication.utils

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myapplication.model.Contact

@Dao
interface ContactDAO {
    @Insert
    suspend fun insertContact(mContact: Contact)

    @Update
    suspend fun updateContact(mContact: Contact)

    @Delete
    suspend fun deleteContact(mContact: Contact)

    @Query("SELECT * FROM contact")
    fun getContact() : LiveData<List<Contact>>

}