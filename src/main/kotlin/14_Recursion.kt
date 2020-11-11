fun main() {
    // A function is called "recursive function" if it calls itself to repeat the process

    print("Enter a number: ")
    val num: Int = Integer.valueOf(readLine())
    val factorial = fact(num)

    println("Factorial of number is: $factorial")


// -2
//    TAIL RECURSION
//    * Use 'tailrec' to declare 'Tail Recursive Function'
    val number = 6
    val tailFactorial = tailFact(number)
    println("\nTAIL FACTORIAL")
    println("Factorial of $number is: $tailFactorial")

}

// -1
fun fact(num: Int): Int {
    return if (num == 1) {
        num // * When value of 'num' becomes '1' stop 'recursion'
    } else {
        // * Function 'fact()' calling itself and doing '-1' from parameter value
        num * fact(num - 1)
    }
}

// -2
tailrec fun tailFact(number: Int, temporary: Int = 1): Int{
    return if(number == 1){
        temporary
    }
    else{
        tailFact(number-1, temporary * number)
    }
}