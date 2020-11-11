package CheezyCodeOOP.Inheritance

fun main() {
    // :3
    // Call 'Parent' & 'Child' class methods from 'Child' class object
    val objChild = Child()

    println()
    objChild.myMethod()
    objChild.myMethod2()

    // Or we can call properties & methods by 'Constructors'
}

// :1
// 'open' keyword is used to tell compiler that this class can be inherited by other class
open class Parent{

    init{
        println("Parent Constructor is called!")
    }

    val name: String = ""
    fun myMethod(){
        println("I'm in Parent Class")
    }
}

// :2
// * Inherit 'Parent' class using ':'
class Child : Parent(){
    init{
        println("Child Constructor is called")
    }
    val name2 : String = ""

    fun myMethod2(){
        println("I'm in Child Class")
        println()
    }
}
