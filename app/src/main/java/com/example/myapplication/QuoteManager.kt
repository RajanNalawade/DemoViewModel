package com.example.myapplication

import android.content.Context
import com.google.gson.Gson

class QuoteManager {
    var quoteList = emptyArray<Quotes>()
    var currentIndexOfQuoteList = 0

    fun populateQuotesFromAssets(context: Context, fileName : String){
        val inputStream = context.assets.open(fileName)
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        quoteList = gson.fromJson(json, Array<Quotes>::class.java)
    }

    fun populateQuotes(quotes: Array<Quotes>){
        quoteList = quotes
    }

    fun getCurrentQuote() : Quotes{
        return quoteList[currentIndexOfQuoteList]
    }

    fun nextQuote() : Quotes{
        return if (currentIndexOfQuoteList == quoteList.size-1)
            quoteList[currentIndexOfQuoteList]
        else
            quoteList[++currentIndexOfQuoteList]
    }

    fun prevQuote():Quotes{
        return if (currentIndexOfQuoteList == 0) quoteList[currentIndexOfQuoteList] else quoteList[--currentIndexOfQuoteList]
    }

    fun getQuoteSize() : Int{
        return quoteList.size
    }
}