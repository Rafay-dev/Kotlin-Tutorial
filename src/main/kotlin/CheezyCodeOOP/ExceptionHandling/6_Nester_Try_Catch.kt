package main.kotlin.CheezyCodeOOP.ExceptionHandling

import java.lang.ArithmeticException

//    The requirement of nested 'try catch' block is aries when a block of code
//    generates an exception and within that block another code statement also
//    generates another exception

fun main() {
    val nume = intArrayOf(4, 8, 16, 32, 64, 128, 256, 512)
    val deno = intArrayOf(2, 0, 4, 4, 0, 8)

    try{
        for (i in nume.indices){
            try{
                println(nume[i].toString() + " / " + deno[i] + " is " + nume[i]/deno[i])
            }
            catch (ex: Throwable){
                println("Can't divided by Zero!")
            }
        }
    }
    catch (ex: ArrayIndexOutOfBoundsException){
        println("Element not found")
    }
}