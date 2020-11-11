// * In Java, data type is automatically converted to other type (in some case)

// But in KOTLIN, conversion is not automatic, we need to explicitly do the Type Conversion

fun main(args: Array<String>){
val num1 : Int = 101
// Convert 'Int' to 'Long'
val num2 : Long = num1.toLong()

println("Number num1 is: $num1")
println("Number num2 is: $num2")
}