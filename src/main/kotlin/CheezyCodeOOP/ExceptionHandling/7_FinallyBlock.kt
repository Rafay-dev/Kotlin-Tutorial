package main.kotlin.CheezyCodeOOP.ExceptionHandling

import java.lang.ArithmeticException
import java.lang.NullPointerException

//  'finally' block is such block which is always execute whether exception is
//    handled or not. So it is used execute important code statement.

fun main() {
    // 1.1
    finallyExample_a()
    println()

    // :2.1
//    finallyExample_b()
    println()

    // :3.1
    finallyExample_c()
    println()
}

//    :1
fun finallyExample_a(){
    try{
        val data = 10/5
        println(data)
    }
    catch (e:NullPointerException){
        println(e)
    }
    finally {
        println("Example C 'finally' executes!")
    }
}
//    :2
fun finallyExample_b(){
    try{
        val data = 4/0
        println(data)
    }
    catch (e:NullPointerException){
        println(e)
    }
    finally {
        println("Example C 'finally' executes!")
    }
}
//    :3
fun finallyExample_c(){
    try{
        val data = 5/0
        println(data)
    }
    catch (e:ArithmeticException){
        println(e)
    }
    finally {
        println("Example C 'finally' executes!")
    }
}