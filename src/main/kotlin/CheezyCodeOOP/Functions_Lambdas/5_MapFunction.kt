package CheezyCodeOOP.Functions_Lambdas

fun main() {
    val userList:List<User> = listOf(
            User(1, "Mike"),
            User(2, "Dave"),
            User(3, "Han")
    )



//    1.1
    val paidUserList = userList.map{
        PaidUser(it.id, it.name, "Paid")
        // * Add 'type=Paid' to all 'userList' entries
    }
    println(paidUserList)
}

//  :1
data class PaidUser(val id: Int, val name: String, val type: String)