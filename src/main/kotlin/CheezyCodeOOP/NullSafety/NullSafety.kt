package main.kotlin.CheezyCodeOOP.NullSafety

fun main() {

    // :1

    // Non-Nullable variable
    var name: String = "Raven"

    // Null variable
    var name2: String? = null

    // A value can also be assigned to 'null' syntax
    var isAdult: Boolean? = true

    // Safe Call
    println(name2?.length)

    // Method to check null
    // -   name2.toUpperCase()
    // * above code will ask to surround the code with null, output below
    if (name2 != null) {
        name2.toUpperCase()
    }

    // Example:2
    // The safe call '?.' executes the relevant call only when the value is
    // non-null. Else it prints 'null'
    name2?.let {
        println("Name is null")
    }

    // Example:3
    var gender2: String? = null

    gender2?.let {
        println("Line 1")
        println("Line 2 $gender2")
        println("Line 3 $it") // '$it' points 'gender2'
    }
    // 'let' can be called with both 'nullable' and 'non-nullable' values


    // Store 'gender2' of 'null' value into a variable
    var selectedValue = gender2 ?: "NA"

    // * Above we use shorthand ifElse (Ternary operator '?:')
    // It's also called Elvis Operator

    // Example 5
    var myValue:String = gender2!!.toUpperCase() // It'll show our exception error
    // '!!' is non-null asserted call
    // It'll call 'toUpperCase()' only if 'gender2' is not null
}


// https://www.youtube.com/watch?v=IWfLygrwanQ&list=PLRKyZvuMYSIMW3-rSOGCkPlO1z_IYJy3G&index=31