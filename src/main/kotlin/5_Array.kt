import kotlin.collections.withIndex as withIndex

fun main(args : Array<String>){
    
//  ARRAY OF MULTIPLE DATA TYPES
    var arr1 = arrayOf("Don Jon", 24, 5.10, 'O')

// SINGLE DATA TYPE
    var arr2 = arrayOf<Int>(1, 4, 7)
    println(arr2[1])

// ACCESS SINGLE ELEMENT
    println(arr1[0])

// MODIFYING ELEMENT
    arr1[1] = 25
    println(arr1[1])

// GET METHOD (get 3 index)
    arr1.get(3)

// SET METHOD (set 3 index VALUE)
    arr1.set(3, 5.11)
    println(arr1[3])

// SIZE OF AN ARRAY
    println("Size of Array is ${arr1.size}")

// SEARCH AN ELEMENT
    println("Array Contains '5.11'?: ${arr1.contains(5.11)}")

//    PRINT ARRAY WITH FOR LOOP
    // Create Array of 'String'
    var arr3 = arrayOf<String>("JOhn", "Mike", "Dan")

    for((i: Int, e: String) in arr3.withIndex()){
        println("$i - $e")
    }
}
