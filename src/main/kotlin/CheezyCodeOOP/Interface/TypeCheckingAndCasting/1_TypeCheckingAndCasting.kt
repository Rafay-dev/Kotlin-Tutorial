package CheezyCodeOOP.Interface.TypeCheckingAndCasting

// :2
fun main() {

    // 1.4
    val circle = Circle(4.0)
    val player = Player("Smiley")


    // 1.5
    // Checking 'object' type

    // Array of two classes object (Only those where 'Draggable'
    // is implemented
    val arr= arrayOf(circle, player)

    println("Draggable Array Output")

    for(obj in arr){
        // Calling Circle class method with our object
        if(obj is Circle){
            println("Area of circle is: ${obj.area()}")
        }
        else{
            // Cast object to Player class
            var obj1 = obj as Player
            obj.sayMyName()
            // or
//            (obj as Player).sayMyName()

            // That's how we can call other class methods with our object
        }
    }

    // 2.1
    val test = Test()

    // * This 'arr2' is not linked to 'Draggable', so we can call all classes methods from objects given in parameters
    val arr2 = arrayOf(circle, player, test)

    // Any array output

    for(obj2 in arr2){
        if(obj2 is Circle){
            println(obj2.area())
        }
        else{
           var obj3 = obj2 as Player
            println(obj3.sayMyName())

            println("'IGNORE EXCEPTION IN THIS EXERCISE'")
        }
    }
}

// :1
interface Draggable{
    fun drag()
}

abstract class Shape : Draggable{
    abstract fun area(): Double
}

// :1.2
class Circle(val radius:Double) : Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun drag() {
        println("Circle is dragging")
    }
}

// 1.3
class Player(val name: String) : Draggable{
    override fun drag() {
        println("$name is dragging")
    }

    fun sayMyName() = println("Hey! my name is - $name")

}

// 2
class Test{
    // ** This class is not implementing 'Draggable' interface
}