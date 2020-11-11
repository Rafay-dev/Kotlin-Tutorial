import kotlin.math.pow
import kotlin.reflect.KFunction2

// Function Syntax:
//  fun functionName(parameter1: DType, parameter2: DType, ...):ReturnType{
    // Block of Code
//  }

fun main() {

//    PRE-DEFINED Function
    var num = 16
    println("Square root of $num is: ${Math.sqrt(num.toDouble())}")

    // -1
    sayHello()

    // -2
    println("Sum: ${sum(10, 20, 30, 40)}")

//    -3
//    INLINE FUNCTION
    val addition = {num1: Int, num2: Int -> num1 + num2}

    println("6 + 4 = ${addition(6, 4)}")

//    -4 (Cheezy Code)
//    CALLING FUNCTION FROM VARIABLE
    var add: (a: Double, b: Double) -> Double = :: sumNumbers
//    According to above condition 'add' variable will accept only
//    function with 2 parameters of 'Double' type and their output
//    should also be 'Double'

    add(8.0, 5.0)

//    -4.2 (Cheezy Code)
//      FINDING POWER OF NUMBER
    add = ::power
    println(add(2.0, 4.0))

//    5 (Cheezy Code)
    printMessage(3) // * This 'count' is 'argument'
    println()
//    Calling function with default parameter value
    printMessage2()

    println("\n")
//    6(Cheezy Code)
    println(addition(4, 4))

//    6.2(Cheezy Code)
    println(addition(4.4, 4.4))
}




//   USER-DEFINED Function -1
fun sayHello(){
    println("Say Hello")
}

//   USER-DEFINED Function With Arguments - 2
    // * vararg is used below to accept 'Integer' value in parameter
fun sum(vararg number: Int): Int{
    var sum = 0
    number.forEach { num -> sum += num }
    return sum
}

//  FUNCTION INSIDE VARIABLE -4 (Cheezy Code)
fun sumNumbers(a:Double, b:Double):Double{
    return a + b
}

// FIND POWER WITH INLINE FUNCTION -4.2 (Cheezy Code)
fun power(a: Double, b:Double) : Double{
    return a.pow(b)
}


// FOR LOOP INSIDE FUNCTION - 5 (Cheezy Code)
fun printMessage(count: Int){
    for (i in 1..count){
        print("\nHello $i")
    }
}
// 5.2
fun printMessage2(count: Int = 2){ // *This 'count' is parameter
    for (i in 1..count){
        print("\nHello $i")
    }
}

// FUNCTION OVERLOADING - 6 (Cheezy Code)
fun addition(a: Int, b: Int): Int{
    return a + b
}

// 6.2 (Same function with parameters of different DataTypes)
fun addition(a: Double, b: Double): Double{
    return a + b
}
