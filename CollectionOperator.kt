/*-------------------------CollectionOperator-----------------------------*/

fun main(args : Array<String>){
    
    val numList = 1..5
    val listSum = numList.reduce { x, y -> x + y }
    println("Reduce sum: $listSum")

    //fold(initial value)
    val listSum2 = numList.fold(0) {x,y -> x + y}
    println("Fold sum: $listSum2 ")

    //check in the list
    println("Evens: ${numList.any{it % 2 == 0}}")  //true
    println("Evens: ${numList.all { it % 2 == 0 }}") //false

    val bigThan3 = numList.filter { it > 3 }
    bigThan3.forEach { n -> println(n) }

    //map

    val times7 = numList.map { it * 7 }
    times7.forEach { n-> println("*7 ： $n") }


/*-------------------------Exception-----------------------------*/

    val divisor =2

    try {
        if (divisor ==0) {
            throw IllegalArgumentException("CANT divided by 0")

    } else {
        println( "5 / $divisor = ${5/divisor}")
    }

    }catch (e: IllegalArgumentException){
        println("${e.message}")

    }
}