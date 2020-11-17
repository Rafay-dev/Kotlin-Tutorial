package main.kotlin.CheezyCodeOOP.SealedClass

// * In 'Sealed Class' we can have multiple data types and their multiple objects and multiple states

fun main() {

    // :1.1
    val tile = Red("Mushroom", 25)

    val tile2 = Red("Fire", 35)

    println("${tile.points} - ${tile.type}")

    println()

    // :2
    val tile3: Tile = Red("Mushroom", 25)
    val points = when(tile3){
        // 'when()' will ask to fetch all classes inside sealed class
        is Red -> tile3.points * 2
        is Blue -> tile3.points * 5
    }

//    'when()' expression in 'Sealed' class covers all the cases and avoid
//    'else' clause

    // 'points' can be either for 'Blue' or for 'Red'

    println("Points = $points") // * 25 * 2 = 50



}


// :1
sealed class Tile

// * Inherit classes with SealedClass
class Red(val type: String, val points: Int) : Tile()
class Blue(val points: Int) : Tile()
// * Here we have restricted the type of 'Tile' that it can
//   either take 'Blue' or 'Red'

// * Extended class must be in the same file within SealedClass

// link:
//https://www.youtube.com/watch?v=gL-3W2R5GPA&list=PLRKyZvuMYSIMW3-rSOGCkPlO1z_IYJy3G&index=30
