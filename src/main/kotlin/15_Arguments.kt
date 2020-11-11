fun main() {

//    -1
//    * Not passing any argument in parameter during function call
    demo()

//    -2
//    * Passing values in argument during function call
    demo1(99)
    // or
    demo1(78, 'C')

//    -3
//    Named Arguments (Change character value by it's name)
    demo2(24, ch = 'R')

}

// -1
fun demo(number: Int = 100, ch: Char = 'A'){
//* functionName(variable Name: Data Type = value)

    println("First Function:")
    print("Number is: $number \nCharacter is: $ch")
}

// -2
fun demo1(num1: Int = 100, charac: Char = 'A'){
    println("\n\nSecond Function:")
    print("Number is $num1 \nCharacter is $charac")
}

// -3
// * Parameters variables are 'local variables' to this function
fun demo2(num: Int = 100, ch: Char = 'C'){
    println("\n\nThird Function:")
    print("Number is $num \nCharacter is $ch")
}

