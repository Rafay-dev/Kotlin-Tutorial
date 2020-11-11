fun main(args : Array<String>){

// LONG STRING
    val longString = """ Welcome to
    VSCode """

    println(longString)


// GET STRING LENGTH
    var name = "Daniel"

    println("String Length: " + name.length)

    // Or
    println("String Length: ${name.length}")


// COMPARE STRINGS

    var str1 = "Blue"
    var str2 = "Blud"

    // 'True' if equals
    println("String Equals? : ${str1.equals(str2)}")

    
    // '0' if equals
    println("String Equals? : ${str1.compareTo(str2)}")

// ACCESS CHARACTER IN A STRING

    var string1 = "Hello"
    println("3rd Index: ${string1.get(3)}")
    // Or
    
    println("3rd Index: ${string1[3]}")

// SUBSTRING
    var str3 = "Hello World"

    println("Index from 2 to 5: " + str3.subSequence(3, 7))

//  SEARCH STRING
    var str4 = "google.com"
    println("Contains '.com'?: " + str4.contains(".com"))

}