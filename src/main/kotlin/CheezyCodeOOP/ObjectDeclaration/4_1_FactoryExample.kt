package main.kotlin.CheezyCodeOOP.ObjectDeclaration

fun main() {
//  1.2
var pizza1 = Pizza.Factory.create("Peppy Paneer")
    println(pizza1)

    // 'create()' method can also be called with its class reference
    var pizza2 = Pizza.create("Tomato")
    println(pizza2)
}


// :1
// Example of Factory Pattern Using 'companion'
class Pizza(val type:String, val toppings: String){
    companion object Factory{
        fun create(pizzaType: String) : Pizza{
            return when (pizzaType) {
                "Tomato" -> Pizza("Tomato", "Tomato, Cheese")
                "Peppy Paneer" -> Pizza("Paneer Farm", "Paneer, Cheese  Burst, Tomato, Onion")
                else -> Pizza("Basic", "Onion, Cheese")
            }
        }
    }

    // Override 'toString' to print 'object' as 'String'
    override fun toString(): String{
        return "Pizza(type='$type', toppings='$toppings')"
    }
}