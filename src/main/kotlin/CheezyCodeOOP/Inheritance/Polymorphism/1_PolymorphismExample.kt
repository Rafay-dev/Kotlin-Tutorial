package CheezyCodeOOP.Inheritance.Polymorphosm

fun main() {
    // 1.4
    // Calling objects of child class with Parent class reference
    val circle : Shape = Circle(4.0)
    val square : Shape = Square(4.0)

    // Printing values of child class methods
    println(circle.area())
    println(square.area())
    println()

    // 2.1
    val shapes = arrayOf(Circle(3.0), Square(4.0), Triangle(3.0, 4.0))
    calculateAreas(shapes)

}

// :1
// Parent Class
open class Shape{
    open fun area() :Double{
        return 0.0 // Default value for 'area()'
    }
}

// :1.2
// inherit 'Shape' class with 'Circle' & 'Square' and override
// 'area()' method
class Circle(val radius :Double) :Shape(){

    override fun area(): Double {
        return Math.PI * radius * radius
    }
}


// :1.3
class Square(val side :Double) :Shape(){

    override fun area(): Double {
        return side * side
    }
}


// :2
// We can make an array of 'Shape' class to find 'area()' of multiple shapes
fun calculateAreas(shapes: Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}

// Now even if we add new shape 'Triangle', we don't have to make any changes in 'calculateAreas'
class Triangle(val base :Double, val height:Double) : Shape(){
    override fun area(): Double{
        return 0.5 * base * height
    }
}