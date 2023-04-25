package com.example.myapplication.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.myapplication.model.Contact
import com.example.myapplication.utils.ContactDAO
import com.example.myapplication.utils.RoomTypeConverters

@Database(entities = [Contact::class], version = 2)
@TypeConverters(RoomTypeConverters::class)
abstract class ContactDatabase : RoomDatabase() {

    abstract fun connectToContactDAO() : ContactDAO

    //Singleton pattern
    companion object {

        private val migration_1_2 = object : Migration(1, 2){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE contact ADD COLUMN isActive INTEGER NOT NULL DEFAULT(1)")
            }

        }

        //volatile - any value assigned to volatile varible that value is available for all threads
        @Volatile
        private var dbInstance: ContactDatabase? = null
        fun getContactDB(mContext: Context) : ContactDatabase{
            if (dbInstance == null){
                synchronized(this){
                    dbInstance = Room.databaseBuilder(mContext.applicationContext, ContactDatabase::class.java, "ContactDB")
                        .addMigrations(migration_1_2)
                        .build()
                }
            }
            return dbInstance!!
        }
    }
}