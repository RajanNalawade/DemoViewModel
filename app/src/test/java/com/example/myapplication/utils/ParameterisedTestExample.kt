package com.example.myapplication.utils

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = Parameterized::class)
class ParameterisedTestExample(private val input: String, private val expectedValue: Boolean) {

    @Test
    fun test() {
        val mHelper = Helper()
        val result = mHelper.isPallindrom(input)
        Assert.assertEquals(expectedValue, result)
    }

    companion object {

        @JvmStatic
        @Parameters(name = "{index} : {0} is pallindrom - {1}")
        fun data() = listOf<Array<Any>>(
            arrayOf("hello", false),
            arrayOf("level", true),
            arrayOf("", true),
            arrayOf("a", true)
        )
    }
}