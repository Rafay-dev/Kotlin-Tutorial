fun main(args: Array<String>){

// PRINT RANGE
    println("NUmber Range:")

    for(num in 1..5){
        println(num)
    }

    println("Character Range:")

    for(ch in 'A'..'E')
    println(ch)

// SEARCH IN RANGE
    var oneToTen = 1..10

    println("3 in oneToTen: ${3 in oneToTen}")
    println("11 in oneToTen: " + (11 in oneToTen))

//
}