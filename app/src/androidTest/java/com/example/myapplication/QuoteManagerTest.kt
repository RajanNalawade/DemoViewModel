package com.example.myapplication

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import org.junit.Test

import org.junit.Assert.*
import java.io.FileNotFoundException

class QuoteManagerTest {

    @Test(expected = FileNotFoundException::class)
    fun populateQuotesFromAssets() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuotesFromAssets(context,"")
    }
    @Test(expected = JsonSyntaxException::class)
    fun testPopulateQuotesFromAssets_InvalidJson_expected_exception() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuotesFromAssets(context,"quotes_test.json")
    }
    @Test
    fun testPopulateQuotesFromAssets_validJson_expected_count() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuotesFromAssets(context,"quotes.json")
        assertEquals(14, quoteManager.quoteList.size)
    }

    @Test
    fun testPopulateQuotesFromAssets_expected_correctQuotes() {
        //Arrange
        val quoteManager = QuoteManager()
        quoteManager.populateQuotes(arrayOf(
            Quotes("adssadfas"),Quotes("ads dfgdg"),Quotes("gdf dfgdfgd"),Quotes("avdvdv")
        ))
        //Act
        val result = quoteManager.prevQuote()
        //assert
        assertEquals(Quotes("adssadfas"), result)
    }
}