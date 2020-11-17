package main.kotlin.CheezyCodeOOP.ExceptionHandling

import java.lang.Exception

fun main() {
    try{
        val a = IntArray(5)
//        a[5] = 10/0
        a[7] = 10
    }
    catch (e:ArithmeticException){
        println("Arithmetic exception catch")
    }
    catch (e:ArrayIndexOutOfBoundsException){
        println("Arry index out of bounds exception catch")
    }
    catch (e:Exception){
        println("Parent Exception Class")
    }

    println("After 'try, catch'")
}