package CheezyCodeOOP.Functions_Lambdas.ScopedFunction

/*    'apply' is an extension function on a type. It runs on the object reference (also known as receiver)
       into the expression and returns the object reference on the completion
 */
fun main() {

    data class Teacher(var name: String, var qualification: String)
    var teacher = Teacher("Jake", "BCOM")

    teacher.apply{
        qualification = "MBA"
    }

    println(teacher.name)
    println(teacher.qualification)
}