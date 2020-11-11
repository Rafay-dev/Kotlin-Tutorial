fun main(args: Array<String>) {
    println("Hello World")

// "val" is immutable(constant) variable

    // ARRAY
    val id = arrayOf(1, 2, 3, 4, 6)
    println(id[0])

    val firstId = id[0]
    println(firstId)

    val lastId = id[id.size-1]
    println(lastId)

    // STRING
    val myName = "Dan"

    // "myName" value can't be change now
    // myName = "Jan" 
    println("My name is " + myName)

    // "var" can be used to create "Mutable" variables
    var age = 24;

    age = 25
    println(age)

    // MENTION DATA TYPE WITH DECLARATION
    var website: String
    website = "w3schools"

    println(website)

    // DATA TYPES:
    
    // 1. Numbers - Byte, Short, Int, Long, Float, Double
    // 2. Bool - True, False
    // 3. Char
    // 4. Arrays
    // 5. Strings


// Byte
    var maxByte: Byte = Byte.MAX_VALUE
    var minByte: Byte = Byte.MIN_VALUE

    println("Max 'Byte' Value: $maxByte")
    println("Min 'Byte' Value: $minByte")

// Short
    var maxShort: Short = Short.MAX_VALUE
    var minShort: Short = Short.MIN_VALUE

    println("Max 'Short' Value: $maxShort")
    println("Min 'Short' Value: $minShort")


// Long
    var maxLong: Long = Long.MAX_VALUE
    var minLong: Long = Long.MIN_VALUE

    println("Max 'Long' Value: $maxLong")
    println("Min 'Long' Value: $minLong")


// Int
    var maxInt: Int = Int.MAX_VALUE
    var minInt: Int = Int.MIN_VALUE

    println("Max 'Int' Value: $maxInt")
    println("Min 'Int' Value: $minInt")


// Float
    var maxFloat: Float = Float.MAX_VALUE
    var minFloat: Float = Float.MIN_VALUE

    println("Max 'Float' Value: $maxFloat")
    println("Min 'Float' Value: $minFloat")


// Double
    var maxDouble: Double = Double.MAX_VALUE
    var minDouble: Double = Double.MIN_VALUE

    println("Max 'Double' Value: $maxDouble")
    println("Min 'Double' Value: $minDouble")

// Boolean
    val boolVal = false
    println(boolVal)

// Character
    val ch = 'A'
    println(ch)

// Assigning null value
    val a :Int ?= null
    val b : String ?= null
    val c : Boolean ?= null

    println("$a\n$b\n$c")


}