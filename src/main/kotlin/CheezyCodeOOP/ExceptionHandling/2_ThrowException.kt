package main.kotlin.CheezyCodeOOP.ExceptionHandling

fun main() {
    // :1.1
    userList(5)

    userList(-2)

}


// :1
fun userList(count: Int){
    if (count >= 0){
        println("User List created containing $count users")
    }
    else{
        // * Show custom error
        throw IllegalAccessException("Count must be greater than 0")
    }
}