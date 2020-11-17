package main.kotlin.CheezyCodeOOP.Collections


//    'Mutable':
//      Can be changed(i.e elements can be add, remove or update)
//    'Immutable':
//      Elements can't be changed

fun main() {
//    Immutable List
    val nums = listOf(4, 5, 6)

    // Some built-in functions
    println("5 is at index: ${nums.indexOf(5)}")
    println("4 exists in list: ${nums.contains(4)}")

    println()

//    Mutable List
    val num2:MutableList<Int> = mutableListOf(1, 2, 3)
    // Update Element
    num2[1] = 3
    // Add Element
    num2.add(5)
    // Remove Element
    num2.remove(1)

    println(num2)

    println()

    val list2: List<Int> = listOf(9, 10)
    // Merge two lists
    num2.addAll(list2)
    println(num2)
}