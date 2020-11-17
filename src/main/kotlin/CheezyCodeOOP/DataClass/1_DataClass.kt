package main.kotlin.CheezyCodeOOP.DataClass

// * Data class can be used to replace 'Getters' & 'Setters'

fun main() {

    // :1.1
    val p1 = Person1(1, "John")
    val p2 = Person1(1, "John")

    println(p1)
    println(p2)
    println(p1.hashCode())
    println(p1 == p2) // return 'false'
    // Above condition will return 'false', because every object is
    // allocated to a new memory

    println()

    // 2.1
    val p3 = Person2(2, "Mark")
    val p4 = Person2(2, "Mark")

    println(p3)
    println(p4)
    println(p3.hashCode())
    println(p3 == p4) // return 'true'
    // Above condition will return 'true', because first it's colling it
    // from 'data class'  reference, and it is returning object as
    // 'String'

    println()

    // 'copy' method in 'Data Class'
    // Data con be copied through 'Data' class object
    val p5 = p4.copy()
    println(p5)

    println()

    // Values can be replaced through parameters
    val p6 = p5.copy(id = 3)
    println(p6)

    println()

    // DESTRUCTURING EXAMPLE:
    val (new_id: Int, new_name: String) = p3
    println(new_id)
    println(new_name)

    println()

    // 3.1
    // 'componentN()' method
    // This method destructure an object into a number of variables
    val stu = Student("Dan", 22, "Third")
    val stuAge = stu.component2()
    val stuPrize = stu.component3()
    val stuName = stu.component1()

    println("Name: $stuName")
    println("Age: $stuAge")
    println("Prize: $stuPrize")



}

// :1
// * Simple class example
class Person1(val id: Int, val name: String){

}

// :2
data class Person2(val id:Int, val name:String){

}


// :3
data class Student(val name: String, val age:Int, val prize: String){

}
