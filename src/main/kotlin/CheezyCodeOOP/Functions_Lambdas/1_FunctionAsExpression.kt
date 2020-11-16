package CheezyCodeOOP.Functions_Lambdas

import kotlin.math.pow

//    * In Kotlin Functions are called First Class Citizen, because they can be treated as normal values


fun main() {
//    :1.1
//    Assign Function to Variable
    var fn: (a: Double, b: Double) -> Double = ::sum
//    * Click on suggestion icon and select 'Specify type explicitly' & select 3rd option
    println(fn(2.2, 3.3))
    println()

    // 2.1
//    (Assigning function with multiple data types)
    var fn2: (a: Int) -> Unit = ::hello
    println(fn2(12))
    println()
}

//    1
fun sum(a: Double, b:Double):Double{
    return a + b
}
fun power(a:Double, b:Double):Double{
    return a.pow(b)
}

//  2
fun hello(a:Int):Unit{

}