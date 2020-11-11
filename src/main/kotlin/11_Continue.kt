fun main() {
    for(n in 1..4){
        println("Before continue, Loop: $n")

        if(n == 2 || n == 4){
            continue // * Skip above values
        }


        println("After 'continue', Loop: $n")
    }

    println()

//    Print EVEN num using CONTINUE
    for (n in 1..10){
        if(n %2 != 0){
            continue
        }
        println("$n")
    }

    println()

//    Nested Loop without 'Continue'
    for(a in 'A'..'D'){
        for(b in 1..4){
            if(b == 2 || b == 4){
                continue
            }
            println("$a and $b")
        }
    }
    println()

//    Nested Loop with 'Continue'
    myloop@ for(c in 'A'..'D'){
        for(d in 1..4){
            if(d==2 || d == 4){
                continue@myloop
            }
            println("$c with $d")
        }
        // * As the value reached '2', the control jumped to the end of
        // outer loop because of the label 'myloop@'
    }
}