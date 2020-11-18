package CheezyCodeOOP.Functions_Lambdas

//    EXTENSION FUNCTION:
/*       Extension function provides a facility to add methods to class without inheriting a class
        or using any type of design pattern. The created extension functions are used as a regular
        function inside that class.
*/

fun main() {
    // :1.1
    // * Format string with custom method
    println("Hello User".formattedString())
}

//  :1
// Create an extension function 'formattedString'
fun String.formattedString(): String{
    return  "-----------------------\n$this\n-----------------------"
}