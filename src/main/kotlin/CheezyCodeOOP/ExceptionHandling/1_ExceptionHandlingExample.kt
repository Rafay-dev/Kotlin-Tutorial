package main.kotlin.CheezyCodeOOP.ExceptionHandling

import java.lang.Exception

fun main() {
    val arrInt = arrayOf(1, 2, 3)

    try{
        // Printing '5th' index of array
        println(arrInt[5])
    }
    catch (ex: NullPointerException){
        // * This is Static Exception
    }
    catch (e: Exception){
        // * This is Base Exception
    }
    finally {
        println("'finally' print output anyway")
    }


}