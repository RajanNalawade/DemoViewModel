package com.example.myapplication.utils

import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class HelperTest {

    /*login for Unit Testing
    1. Arrange
    2. Act
    3. Assert*/

    lateinit var mHelper: Helper

    @Before
    fun setUp(){
        mHelper = Helper()
        print("Before Every Test Case")
    }

    @After
    fun tearDown(){
        print("After Every Test Case")
    }

    @Test
    fun isPallindrom() {
        //Arrange
        //val mHelper = Helper()
        //Act
        val result = mHelper.isPallindrom("hello")
        //Assert
        assertEquals(false, result)
    }

    @Test
    fun isPallindrom_inputString_level_expectedTrue() {
        //Arrange
        //val mHelper = Helper()
        //Act
        val result = mHelper.isPallindrom("level")
        //Assert
        assertEquals(true, result)
    }

    @Test
    fun validatePassword_passwordBlank_expectedFalse() {
        val res = mHelper.validatePassword("")
        assertEquals(false, res)
    }
    @Test
    fun validatePassword_passwordLength4_expectedFalse() {
        val res = mHelper.validatePassword("wwww")
        assertEquals(false, res)
    }

    @Test
    fun validatePassword_passwordLength20_expectedFalse() {
        val res = mHelper.validatePassword("wwww1234567890werttg")
        assertEquals(false, res)
    }

    @Test
    fun validatePassword_validPassword_expectedTrue() {
        val res = mHelper.validatePassword("1234567890")
        assertEquals(true, res)
    }

    @Test(expected = IllegalArgumentException::class)
    fun reverseString_nullInput_expectedBlank() {
        val result = mHelper.reverseString(null)
    }

    @Test
    fun reverseString_blankInput_expectedSame() {
        val result = mHelper.reverseString("  ")
        assertEquals("  ", result)
    }

    @Test
    fun reverseString_aInput_expectedSame() {
        val result = mHelper.reverseString("a")
        assertEquals("a", result)
    }

    @Test
    fun reverseString_abcdInput_expecteddcba() {
        val result = mHelper.reverseString("abcd")
        assertEquals("dcba", result)
    }
}