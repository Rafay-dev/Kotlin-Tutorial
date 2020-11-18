package CheezyCodeOOP.Functions_Lambdas

/*
    INLINE FUNCTION:
        An 'inline function' is declare with a keyword inline. The use of inline function enhances the
        performance of higher order function. The inline function tells the compiler to copy parameters
        and functions to the call site.
 */


fun main() {
    // 3
    calculateTimeAndRun {
        loop(100000000)
    }

    // 4.1
    inlineExample ({ println("Calling inline function") })
}

//  :1
fun loop(n: Long){
    for (i in 1..n){

    }
}

//  :2
// Calculate function response time
fun calculateTimeAndRun(fn: ()-> Unit){
    val start: Long = System.currentTimeMillis()

    fn()

    val end = System.currentTimeMillis()

    println("Time taken: ${end-start} ms")
}

//    * Inline Example
// :4
inline fun inlineExample(myFun: () -> Unit){
    myFun()

    println("code inside inline function")
}