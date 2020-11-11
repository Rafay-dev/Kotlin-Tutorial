fun main(args: Array<String>) {

//  if Statement
    val number = 100

    if(number %2 == 0){
        println("Input in Even number")
    }

    println("Out of Statement!")


//  If Else Statement
    val marks = 32
    if(marks < 30){
        println("Fail")
    }
    else{
        println("Pass")
    }

//  Else If
    if(marks >= 75){
        println("A grade")
    }
    else if(marks in 60..74){
        println("Grade B")
    }
    else if(marks in 45..59){
        println("Grade C")
    }
    else if(marks in 31..44){
        println("Grade D")
    }

//    NESTED (if else)
    val num = -100

    if(num < 0){
        println("Negative Number")
    }
    if(num%2 == 0){
        println("Even Number")
    }
    else{
        println("Odd Num")
    }



}