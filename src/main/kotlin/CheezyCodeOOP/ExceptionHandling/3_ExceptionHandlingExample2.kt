package main.kotlin.CheezyCodeOOP.ExceptionHandling

import java.lang.ArithmeticException


fun main() {
    try{
        val data = 20/0 // may throw exception
    }
    catch (e: ArithmeticException){
        println(e)
    }

    println("Code Below Exception")
}