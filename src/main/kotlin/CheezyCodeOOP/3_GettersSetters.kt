package CheezyCodeOOP

fun main() {

    // 2.1
    val p1 = Person3("Mike", 22)

    println(p1.name)
    println(p1.age)
    p1.age = -12
//   Above condition shows our validation error

}

// 1
// Define 'lateinit' property
class Calculator{

    lateinit var message: String
    // * 'lateinit' means property value will be initialize later
    // 'latinit' always declared as 'var'
    // 'lateinit' can't be used for other Data Types than 'String'
}

// 2
// GETTER & SETTER
//    To write 'getter or setter' or for a property, just write
//    'get' or 'set' method below it's declaration

class Person3(nameParam: String, ageParam: Int){
//  * Make 'name' and 'age' values are equal to class parameters values

    // GETTER FOR NAME
    // Print 'name' value in Uppercase
    var name: String = nameParam
    get(){
        return field.toUpperCase()
    }

    // SETTER FOR AGE
    //    Check if age value is given negative
    var age: Int = ageParam
    set(value) {
        if(value > 0){
            field = value
        }
        else{
            println("Age can't be negative")
        }
    }

    // 3
    // Default syntax for 'Getter' & 'Setter'
    var email: String = ""
    get() = field
    set(value){
        field = value
    }

}