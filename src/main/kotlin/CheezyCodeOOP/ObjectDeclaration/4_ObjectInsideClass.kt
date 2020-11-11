package CheezyCodeOOP.ObjectDeclaration

import javax.security.auth.login.AppConfigurationEntry

//  Note:
//  Only one 'companion' object is allowed in a class

fun main() {
//    :1.1
//    * We can call this object without initializing it
    ObjectInsideClass.MyObject.f()

//  :1.3
    ObjectInsideClass.MyObject2.g()

//  :1.4
//    * Calling function without object reference (* from companion object only)
    ObjectInsideClass.h()
}

//    :1
class ObjectInsideClass {
    //    Object Inside Class
    object MyObject {

        fun f() {
            println("Hello, I'm 'f' from class object")
        }
    }

    //    :1.2
// * We can create multiple objects inside class
    object MyObject2 {

        fun g() {
            println("Hello, I'm 'g' from class object")
        }
    }

    //    :1.4
//    We can use 'companion' before object name, so that we can call
//    methods & properties from our Objects directly with our
//    Class Name reference
    companion object MyObject3 {

        // Use '@JvmStatic' so these methods can be called by our Java class with 'ObjectInsideClass' reference
        // In short they'll be treated as 'static' methods in our Java class file

        @JvmStatic
        fun h() {
            println("Hello I'm 'h' from class object")
        }
    }

    // * Companion object is a replica in Kotlin of 'static' method of Java
    // * In Koltin, we don't have 'static' keyword


    // * Companion are basically used for 'Factory Pattern' in Kotlin

    // Factory Pattern are basically methods where we pass 'parameters'
    // and it returns 'objects'
    // It's basically Factory of 'objects'
}
