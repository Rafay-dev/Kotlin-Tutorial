fun main() {
//    'Lambda' function is also known as 'anonymous' function,
//    because it has no name. Parameters are in the left side
//    and code is on the right side

    val sum = {num1: Int, num2: Int -> num1 + num2}

    println("10 + 5 = ${sum(10, 5)}")
}