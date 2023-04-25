package com.example.myapplication.utils

import androidx.room.TypeConverter
import java.util.*

class RoomTypeConverters {

    @TypeConverter
    fun fromDateToLong(mDate: Date): Long {
        return mDate.time
    }

    @TypeConverter
    fun fromLongToDate(mLongDate: Long): Date {
        return Date(mLongDate)
    }
    
}