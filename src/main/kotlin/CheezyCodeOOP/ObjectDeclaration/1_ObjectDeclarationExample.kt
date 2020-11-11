package CheezyCodeOOP.ObjectDeclaration


// :3
fun main() {
    println(A.num)
    B.test()
}

// :1
object A{
    val num:Int  = 10
}

// :2
object B{
    val p:Int = 20
    fun test(){
        println("Object B")
    }
}