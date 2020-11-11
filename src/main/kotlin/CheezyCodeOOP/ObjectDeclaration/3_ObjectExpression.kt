package CheezyCodeOOP.ObjectDeclaration

fun main() {


//    :1
//    Creating 'object' as expression
    var testObj = object{
        val i :Int = 10
        fun method(){
            println("I'm an Object Expression")
        }
    }
    println(testObj.method())

    println()

//    :2.1
//     Calling interface as expression
    var obj = object : Cloneable{
        override fun clone() {
            println("Clone Method")
        }
    }

    obj.clone()

    println()

    // * In (2.1), We have call our interface as expression. Now we don't need to extend the 'interface'
//    with any class, we can call it as expression and also can initialize its body in it.

    // :3.1
    var obj2 = object : Person("Yonus Khan"){
        override fun fullName() {

            super.fullName()
            // * This will call 'fulName()' from 'Person' class


            println("Anonymous call - $name")
        }
    }

    // Calling 'fullName()' in 'main()' method
    obj2.fullName()
}

//  :2
interface Cloneable{
    fun clone()
}

//    :3
open class Person(val name:String){
    open fun fullName() = println("Person class call:  $name")
}