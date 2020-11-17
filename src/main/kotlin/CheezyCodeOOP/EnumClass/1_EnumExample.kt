package main.kotlin.CheezyCodeOOP.EnumClass

fun main() {
    // :1.1
    // * Initializing 'enum' object
    val day = Days.MONDAY
    println(day)

    println()

    // :2.1
    // Print 'name' and 'roll number' of 'Student' enum object
    val student = Students.JOHN
    println("${student.name} roll no. is ${student.rollNum}")
    // * 'name' is the 'Key' of our 'Enum Object'

    println()

    //  :2.2
    // Print 'Students' with for loop
    for(i in Students.values()){
        println(i)
    }

    println()

    // :2.4
    student.bio()
}

// :1
enum class Days{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

// :2
// * 'Constructors' can also be defined in 'Enum' class
enum class Students(val rollNum: Int){
    // * Now we have to assign an 'Int' to each Enum object
    MIKE(1),
    JOHN(2),
    DAVE(3);

    // :2.3
    // Defining Methods in EnumClass
    // * Place ';' above before defining method
    fun bio(){
        var name = this.name
        // * 'this.name' is a reference of 'Student.NAME'

        var rank: String ?= null

        if(this.name.toString() == "JOHN"){
            rank = "Senior"
        }
        else{
            rank = "Junior"
        }

        println("$name rank is '$rank'")
    }
}