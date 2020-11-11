package CheezyCodeOOP

fun main() {

// - 1.1
//    CREATE OBJECT
    val mustang = Car("Mustang", "Petrol", 100)
    val beetle = Car("Beetle", "Diesel", 200)

    // Calling Properties (Variables) from class
    println(mustang.name)
    println(mustang.type)

    // Calling Methods (Functions) from class
    beetle.driveCar()
    mustang.driveCar()

    beetle.applyBrakes()

//    - 2.1
//   Objects
    val p1 = Person("Diana", 24)
    val p2 = Person("Blake", 16)

    println("${p1.name} can vote: ${p1.canVote()}")
    println("${p2.name} can vote: ${p2.canVote()}")

}

// 1
// Create class (With Parameters Constructor)
class Car(val name: String, val type: String, var kmRun: Int){
    fun driveCar(){
        println("$name starts driving!")
    }

    fun applyBrakes(){
        println("$name applied brakes!")
    }
}

// 2
class Person(val name: String, var age: Int){
    fun canVote(): Boolean{
        return age > 18
        // *  This method check if person is more than 18 years old or not
    }
}