package com.example.myapplication.utils

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = Parameterized::class)
class PasswordParameterisedTest(private val password : String?, private val expectedValue : Boolean) {

    private lateinit var mHelper: Helper

    @Before
    fun setUp(){
        mHelper = Helper()
    }

    @Test
    fun validatePassword(){
        val result = mHelper.validatePassword(password)
        Assert.assertEquals(expectedValue, result)
    }

    companion object{

        @JvmStatic
        @Parameters(name = "{index} - {0} is valid password {1}")
        fun data() = listOf<Array<Any?>>(
            arrayOf("null", false),
            arrayOf("", false),
            arrayOf("12345678", true),
            arrayOf(null, false),
            arrayOf("       ", false),
        )
    }
}