/*-------------------------Higher order function-----------------------------*/

fun main(args : Array<String>){

    val numList = 1..20

    //filter -> keyword it, don't have to define 'it' again
    val evenList = numList.filter { it % 2 == 0  }
    evenList.forEach { n -> println(n) } // 2 4 6 8 ..20

    /*------------------------------------------------------*/
    //Function generates function

    val multi3 = makeMathFunc(3) // 3 pass to num1
    println("5 * 3 =  ${multi3(5)}") //15
    /*------------------------------------------------------*/

    val multiply2 = {num1: Int -> num1 * 2}
    val numList2 = arrayOf(1,2,3,4,5)
    mathOnList(numList2, multiply2) //2 4 6 8 10

}
// function -> function
fun makeMathFunc(num1: Int) : (Int) -> Int = {num2 -> num1 * num2}

// function(Array + function)
fun mathOnList(numList: Array<Int>, myFunc:(num: Int) -> Int){
    for(num in numList){
        println("MathOnList ${myFunc(num)}")
    }
}