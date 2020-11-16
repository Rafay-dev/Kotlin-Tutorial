package CheezyCodeOOP.Functions_Lambdas

//    HIGH ORDER FUNCTION
//    Function that accepts function as an argument or return functions or both

fun main() {
    // 1.1
    // Assigning function to variable
    var fn:(a:Double, b:Double)->Double = ::sum2
    println(fn(2.0, 4.0))
    println()

    // 2.1
    calculator(5.0, 5.0, ::sum2)
    println()

    // 3.1
    val fn2:(String, String) -> String = {stuName, stuPosition -> "$stuName gets $stuPosition position"}

    studentResult("'George'", "'Second'", fn2)
}

//  1
fun sum2(a: Double, b:Double):Double{
    return a + b
}

// 2
//  HighOrderFunction (Function that takes a function as input)
fun calculator(a:Double, b:Double, gn:(Double, Double) -> Double){
    // Assigning parameter function 'gn()'
    val result = gn(a, b)
    println(result)
}


// 3
fun studentResult(stuName:String, stuPosition:String, fn2: (String,String) -> String): Unit{
    val result2 = fn2(stuName, stuPosition)
    println(result2)
}