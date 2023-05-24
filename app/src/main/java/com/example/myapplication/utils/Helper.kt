package com.example.myapplication.utils

import java.lang.IllegalArgumentException

class Helper {

    fun isPallindrom(input: String): Boolean {
        var len = input.length - 1
        var i = 0
        var result = true

        while (len > i) {
            if (input[i] != input[len]) {
                result = false
                break
            }
            i++
            len--
        }
        return result
    }

    fun validatePassword(strPassword: String?): Boolean {

        val len = strPassword?.length ?: 0
        return if (len == 0 || strPassword?.isBlank() == true){
            false
        } else {
            len in 6..15
        }
    }

    fun reverseString(input : String?) : String{
        var i : Char
        return if (input == null){
            throw IllegalArgumentException("Input String is Required")
        } else {
            val len = input.length
            var reverseString : String = ""
            for (j in 0 until len){
                i = input[j]
                reverseString = i + reverseString
            }
            reverseString
        }
    }
}