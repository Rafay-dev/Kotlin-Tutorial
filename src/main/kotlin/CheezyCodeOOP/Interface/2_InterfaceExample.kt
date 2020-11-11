package CheezyCodeOOP.Interface

fun main() {

    // :3.1
    dragObjects(arrayOf(Circle(4.0), Square(4.0), Triangle(2.0, 3.0), Player2("Smiley")))
}


// :1
interface Draggable{
    fun drag()
    // * By default properties & methods with no body are 'abstract' methods in 'interface'
    // And we have to implement all abstract properties and methods when we implement a class
}


// :2
abstract class Shape:Draggable{
    abstract fun area(): Double
}
// * We've to implement both 'area()' and 'drag()' methods in all 'Shape' subclasses

// 2.1
class Circle(val radius:Double) : Shape(){
    override fun area(): Double  = Math.PI * radius * radius
    override fun drag() {
        println("Circle is dragging")
    }
}

// 2.2
class Square(val side:Double) : Shape(){
    override fun area(): Double  = side * side
    override fun drag() {
        println("Square is dragging")
    }
}

// 2.3
class Triangle(val base:Double, val height: Double) : Shape(){
    override fun area(): Double  = 0.5 * base * height
    override fun drag() {
        println("Square is dragging")
    }
}

// :3
fun dragObjects(objects: Array<Draggable>){
    // * This method will only access methods of 'Shape' class and it's child classes
    for (obj in objects){
        obj.drag() // This is printing 'drag' method in sub-classes

    }
}

// :4
class Player(val name:String){
    fun drag() = println("$name is dragging")
}

// :4.1
// Implement 'Draggable' interface
class Player2(val name: String): Draggable{
    override fun drag() {
        println("$name is dragging")
    }
}

// SUMMARY:
// This is how we can implements common behaviour between different classes through 'interface'