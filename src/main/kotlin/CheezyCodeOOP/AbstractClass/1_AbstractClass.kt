package CheezyCodeOOP.AbstractClass

// * Abstract 'properties' & 'methods' can only exists in an 'abstract' class

fun main() {
    // :2
    // Abstract class cannot be instantiated
    //    val shape = Shape()
    val circle = Circle(4.0)
    println("Area of Circle is - ${circle.area()}")
    circle.display()

    println()

    // :5.1
    dragObjects(arrayOf(Circle1(4.0), Square(4.0), Triangle(2.0, 3.0)))
}

// :1
// * Create abstract class using 'abstract'
abstract class Shape{
    var name: String = ""
    abstract fun area() : Double // Abstract Method can't have body

    // Non abstract method
    open fun display() = println("Display method of abstract class")
}

// :1.1
// * Inherit 'Shape' class
class Circle(val radius: Double) : Shape(){

    // Override 'abstract' method 'area()' of 'Shape' class
    override fun area(): Double = Math.PI * radius * radius
}


// :3
// Create an abstract class
abstract class Shape2{
    abstract fun area(): Double
    abstract fun drag()
}

// :4
// Create different shapes classes and implement the abstract class
// * We have to 'implements' all abstract methods and properties
// when we implement an abstract class

// 4.1
class Circle1(val radius:Double) : Shape2(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun drag() {
        println("Circle is dragging!")
    }
}

// 4.2
class Square(val side:Double) : Shape2(){
    override fun area(): Double {
        return side * side
    }

    override fun drag() {
        println("Square is dragging")
    }
}

// 4.3
class Triangle(val base:Double, val height:Double) : Shape2(){
    override fun area(): Double {
        return 0.5 * base * height
    }

    override fun drag() {
        println("Triangle is dragging")
    }
}

// 5
// Call all shapes drag functions by saving them in an Array
// And running them all through forLoop
fun dragObjects(objects: Array<Shape2>){
    for (obj in objects){
        // "POLYMORPHISM"
        // We've created the object of Parent class, but we'll call
        // the methods of child class with this reference
        obj.drag()
    }
}

