package main.kotlin.CheezyCodeOOP.SealedClass

fun main(args: Array<String>) {

    // :1.3
    var circle = Shape.Circle(5.0f)
    var square = Shape.Square(5)
    var rectangle = Shape.Rectangle(4,5)

    eval(circle)
    eval(square)
    eval(rectangle)
}

// :1.2
fun eval(e: Shape) =
        when (e) {
            is Shape.Circle ->println("Circle area is ${3.14 * e.radius * e.radius}")
            is Shape.Square ->println("Square area is ${e.length * e.length}")
            is Shape.Rectangle ->println("Rectagle area is ${e.length * e.breadth}")
            //else -> "else case is not require as all case is covered above"

        }

// :1
sealed class Shape{
    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    class Rectangle(var length: Int, var breadth: Int): Shape()

}