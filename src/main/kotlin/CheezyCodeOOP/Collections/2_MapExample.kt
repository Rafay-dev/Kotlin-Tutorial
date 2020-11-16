package CheezyCodeOOP.Collections

//  MAP:
//    Map is an interface and generic collection of elements.
//    Map interface holds data in the form of 'key' and 'value' pair.
//    Map 'key' are unique and holds only one value for each key.
//    The 'key' and 'value' may be of different pairs such as <Int, Int>,
//    <Int, String>, <Char, String> etc.

//  To use the Map interface we need to use its function called
//    'mapOf()' or 'mapOf<k,v>()

fun main() {
    // :1
    val students = mutableMapOf<Int, String>()
    // Add elements in 'map'
    students.put(1, "Jon")
    students.put(2, "Tom")
    students.put(3, "Ray")

    // Print single element
    println(students.get(1))
    println()

    for ((key, value) in students){
        println("$key = $value")
    }
    println()

    // Add at specific index
    students[8]
    println(students)
    println()


    // :2
    //  'Immutable Map'
    val map2 =  mapOf<Int, String>(1 to "Hello", 2 to "World")
    println(map2)
}