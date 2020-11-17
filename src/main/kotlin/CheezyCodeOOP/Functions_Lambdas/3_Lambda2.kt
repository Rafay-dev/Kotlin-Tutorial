package CheezyCodeOOP.Functions_Lambdas

fun main() {
    // 1.1
    println(calculator(1,2) {a, b -> a + b})

    // 'calculator' function can also be called like:
//    calculator(1, 2, {a, b -> a + b}
}

// :1
fun calculator(a: Int, b:Int, op: (Int, Int) -> Int) : Int{
    return op(a,b)
}