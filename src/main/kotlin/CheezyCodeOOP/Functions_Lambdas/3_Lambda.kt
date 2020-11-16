package CheezyCodeOOP.Functions_Lambdas

/*  Lambda:
*       Lambda is a function which has no name. Lambda is defined with
*   a curly braces{} which takes 'variable' as a
*/

fun main() {
    // :1.1
    addNumber(5, 10)
    println()

    // :2.1
    val mylambda: (Int) -> Unit = {s:Int -> println(s)} // lambda function
    addNumberss(5, 10, mylambda)
    println()

    // :3
    val lambda1 = {x: Int, y:Int -> x + y}

    val multiLineLambda = {
        println("Lambda Function Called")
        val a = 2 + 3
        "Hello Word"
        2

        // The dataType of the last value will be the return type
    }

    // :3.1
    println(multiLineLambda())
    println()

    // :4
    val singleParamLambda = {x: Int -> x * x}
    // OR
    val lambda2: (Int) -> Int = {x -> x * x}

    println("Square of 4 is ${singleParamLambda(4)}")
    println()


    val loginUser = { user: String -> println("$user Logged In!") }
    // OR
    val loggedOutUser:(String) -> Unit = {user -> println("$user Logged Out!")}

    println(loginUser("Jade"))
    println()
    println(loggedOutUser("Jade"))

}

//  :1 (Normal Function)
fun addNumber(a: Int, b:Int){
    val add = a + b
    println(add)
}

//  :2 (High Order{Lambda as parameter})
fun addNumberss(a: Int, b:Int, mylambda: (Int)->Unit){
    val add = a + b
    mylambda(add)
}



