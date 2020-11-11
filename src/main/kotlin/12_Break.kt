fun main() {
    for (n in 1..10){
        println("Before Break, Loop: $n")
        if(n == 5){
            println("Terminating Loop")
            break
        }
    }

//    'Break' in Nested Loop
    myloop@ for(ch in 'A'..'C'){
        for (n in 1..4){
            println("$ch and $n")

            if(n == 2)
                break@myloop
        }
    }
}