package CheezyCodeOOP

// Passing default values in parameters of a class is called
// creating a Constructor. We need to pass the value in parameters
// of class object that we declare in class constructor parameter.
// Or we can assign default values in class constructor parameter.

// Constructor can be created separately inside a class and it
// runs as soon as the object is created

// There are two types of Constructors in Kotlin
//    1. inti{}     - Primary
//    2. constructor(){}    - Secondary
// * Both constructor methods can be created multiple times inside a class

fun main() {

//    1.1
    var person2 = Person2("Jake", 22)
    println(person2.name)
    println(person2.age)
    println()

//    2.1
    var car = AutoMobile("Mehran", 4, 4, true)

    println("Car has airbags: ${car.airBags}") // 'hasAirBags' will be called by 'airBags' variable (Assigned in class)
    println()

//    3.1
    var myCar = AutoMobile2("Civic", "Petrol")

}

// -1
// Assigning parameters inside Constructor to 'name' & 'age
class Person2(nameParam: String, ageParam: Int){
    val name: String = "$nameParam - Clan"
    var age: Int = ageParam
}


// -2
// Assigning Variables inside constructor
class AutoMobile(val name:String, val tyres: Int, val maxSeats: Int, hasAirBags: Boolean){

    var airBags = hasAirBags

    fun drive(){}
    fun applyBrakes(){}

    // 2.2
    // Using init
    init{
        println("Primary Constructor Called")
    }
}

//    3
class AutoMobile2(val name: String, val tyres: Int, val maxSeats: Int, val engineType: String){
    // * This is Primary Constructor
    init{
        println("$name is built")
    }
    init {
        println("2nd initialization called")
    }

    // * This is Secondary Constructor
    constructor(nameParam: String, engineParam: String) : this(nameParam, 4, 5, engineParam)
    // Now 'tyres' and 'maxSeats' doesn't need to be defined in class Object or they can be
    // override during object initialization
}
