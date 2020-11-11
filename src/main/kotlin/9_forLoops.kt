fun main() {
//    For Loop
    for (n in 10..15){
        println("Loop $n")
    }

//    Print ARRAY using LOOP
    val myArr = arrayOf("ab", "bc", "cd")
    for (i in myArr){
        println(i)
    }

//    LOOP through ARRAY indices
    val arr2 = arrayOf(4, 6, 8, 12, 14, 16)
    for(j in arr2.indices){
        println("Index[$j]: ${arr2[j]} ")
    }

//    Using "withIndex()"
    for((index, value) in myArr.withIndex()){
        println("Value at Index $index is: $value")
    }
}