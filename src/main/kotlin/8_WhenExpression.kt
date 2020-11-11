fun main(args:Array<String>) {
    var ch = 'A'

    when (ch) {
        'A' -> println("$ch Is Vowel")
        'E' -> println("$ch Is Vowel")
        'I' -> println("$ch Is Vowel")
        'O' -> println("$ch Is Vowel")
        'U' -> println("$ch Is Vowel")

        // Or
        // 'A', 'E', 'I', 'O', 'U' -> println("$ch is Vowel")

        else -> println("$ch is Consonant")
    }

//    'WHEN' with 'RANGE'
    var num = 78
    when (num) {
        in 1..9 -> println("$num is a single digit number")
        in 10..99 -> println("$num is a double digit number")
        in 100..999 -> println("$num is a three digit number")
        else -> println("$num has more than three digits")
    }

//    ARITHMETIC operation inside WHEN
    var age = 16
    when(age){
        in 1..17 ->{
            val num1 = 18 - age
            println("You'll be eligible for Voting in $num1 years")
        }
        in 18..150 ->{
            println("You're eligible for voting")
        }

    }
}