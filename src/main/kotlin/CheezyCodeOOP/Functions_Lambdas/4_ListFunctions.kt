package CheezyCodeOOP.Functions_Lambdas

fun main() {
    // :1
    val nums = listOf<Int>(1, 3, 5, 7, 2, 4, 6, 9)

    // :2.1
    // Check if a number is 'Odd'
    println(isOdd(3))
    println(isOdd(2))
    println()

    // :2.2
    // 'filter' list with 'isOdd' function
    val list2 = nums.filter(::isOdd)
    // * above code will check each element of list with 'isOdd()'

    println("Odd Numbers in List $list2")
    println()

    // Another method to use 'filter' (Anonymous Function)
    val list3 = nums.filter(fun(b: Int): Boolean {
        return b % 2 == 0
    })
    println("Even numbers in list: $list3")
    println()

    // Another method to use 'filter' (Lambda)
    val list4 = nums.filter { c: Int -> c % 3 == 0 }
    println("Numbers Divisible by 3: $list4")
    println()

    // Another method to use 'filter' (it)
    val list5 = nums.filter { it < 5 }
    println("Numbers less than 5: $list5")
    println()

    // :3.1
    val userList: List<User> = listOf(
            User(1, "Mike"),
            User(2, "Dave"),
            User(3, "Han")
    )
    println(userList.filter { it.id == 2 })
    println()

    // :4.1
    val paidUserList = userList.map {
        PaidUser(it.id, it.name, "Paid")
        // * Add 'type=Paid' to all 'userList' entries
    }
    println(paidUserList)
    println()

//    5
//    Printing List using forLoop
    userList.forEach{println(it)}

}

//  :2
fun isOdd(a: Int): Boolean {
    return a % 2 != 0
}

//    :3
data class User(val id: Int, val name: String)

//  :4
data class PaidUser(val id: Int, val name: String, val type: String)