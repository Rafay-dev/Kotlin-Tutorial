package main.kotlin.CheezyCodeOOP.ExceptionHandling

import java.lang.ArithmeticException
import java.lang.NumberFormatException


// 'try' block can be used as an expression which returns a value. The value
//  returned by 'try' exception is either the last expression of 'try' block
//  or the last expression of 'catch'
//  Contents of finally block do not affect the result of the expression.

fun main() {
    // :1.1
    val str = getNumber("10")

    val str2 = getNumber("10.5")

    println(str)
    println(str2)
}

//  :1
fun getNumber(str: String):Int{
    return try{
        // Parse String to Int
        Integer.parseInt(str)
    }
    catch (e:ArithmeticException){
        0
    }
    catch (e: NumberFormatException){
        0
    }
}