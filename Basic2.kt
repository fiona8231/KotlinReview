
/*--------------------------Function-----------------------------*/

fun main(args : Array<String>){

    fun add(num1: Int, num2 : Int) :Int = num1+num2
    println(" 5 + 4 = ${add(5,4)}")

    fun subtract(num1 : Int =10, num2 : Int =2) = num1 - num2
    println("5 - 4 = ${subtract(5,4)}") // 5 -4 = 1

    println("2 - 3 = ${subtract(num1 = 2, num2 =3)}")

    //return void --> Unit
    fun sayHello(name: String) : Unit = println(" Hello $name")
    sayHello("Cat")

   //get 2 values passed back from one function
    val (two, three) = nextTwo(1)
    println("1 $two $three") //1 2 3


    println(" Sum = ${getSum(2,4,5,7,9)}")

    val mutiply = {num1:Int, num2: Int -> num1 * num2}
    println(" 3 * 4 = ${mutiply(3,4)}")

    //factorial

    println("3! = ${factorial(3)}")



}

  fun getSum(vararg  nums: Int) :Int{
      var sum = 0
      nums.forEach { n -> sum +=n }
      return sum
  }

   fun nextTwo(num: Int): Pair<Int, Int>{
       return Pair(num+1, num+2)
 }


// calculate factorial using tail recursion
   fun factorial( x : Int) :Int{

      tailrec fun factTail(y : Int, z :Int) : Int{
        if (y == 0) return z
        else return factTail( y - 1, y * z)
      }
    return factTail(x, 1)

}

//


