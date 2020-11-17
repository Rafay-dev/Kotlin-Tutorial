package main.kotlin.CheezyCodeOOP.ExceptionHandling

import java.lang.ArithmeticException

fun main() {
    // :1.1
    validate(15)
}

//  :1
fun validate(age: Int){
    if (age < 18){
        throw ArithmeticException("Under Age")
    }
    else{
        println("Eligible for Voting")
    }
}
