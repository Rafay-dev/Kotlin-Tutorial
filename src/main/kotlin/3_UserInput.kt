import java.util.Scanner

fun main(args: Array<String>) {  
    println("Enter your name: ")  
    val name = readLine()  

    println("Enter your age: ")  
    
    // Converting "String" input to "Integer"
    var age: Int =Integer.valueOf(readLine())  
    println("\nYour name is '$name' and your age is '$age'")  

    // Taking input other than STRING
    // * import java.util.Scanner

    // Create Scanner Object
    val read = Scanner(System.`in`)

    // Take 'Integer' input
    println("Enter an 'int' value: ")
    var num1 = read.nextInt()

    
    // Take 'Float' input
    println("Enter an 'float' value: ")
    var num2 = read.nextFloat()


    println("Integer Value: " + num1)
    println("Float Value: " + num2)
}  