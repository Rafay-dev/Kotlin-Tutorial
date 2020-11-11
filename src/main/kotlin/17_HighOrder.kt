fun main() {

    // HIGH ORDER FUNCTION:
//        High Oder Function can have another function as a parameter or return a function or can do both

//    -3
    fun1("Roid Loper", :: name)

// - 4.2
    val sum = fun2(10)

    println("10 + 20: ${sum(20)}")
}

// -1
fun fun1(str: String, myFunc: (String) -> Unit){
    print("Username is: ")
    myFunc(str)
}

// -2
fun name(str: String){
    println(str)
}

// -4
//    HIGH ORDER: Function returns function
fun fun2(num1: Int) : (Int) -> Int = {num2 -> num2 + num1}