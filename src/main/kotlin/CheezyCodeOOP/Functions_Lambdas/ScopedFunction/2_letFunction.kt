package CheezyCodeOOP.Functions_Lambdas.ScopedFunction

/*    'let' takes the object it is invoked upon as the parameter and returns the result of the lambda expression.
       'let' is a scoping function wherein the variables declared inside the expression cannot be used outside.
        The last value of 'let' function will be the return value of its scoped
 */

fun main() {

    data class Teacher(var name: String, var qualification: String)
    var teacher = Teacher("Jake", "BCOM")

    teacher.let{
        println(it.name)
        println(it.qualification)
    }

}