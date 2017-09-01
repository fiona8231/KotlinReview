import java.util.*

fun main(args : Array<String>){
  println("Hello World!")

  // variable
  // unchangeable
   val name = "CAT"

  //changeable
   var age1 = 33

  var bigInteger :Int = Int.MAX_VALUE
  var smallInteger :Int = Int.MIN_VALUE

  println("The biggest integer: " + bigInteger)
  println("The smallest integer: " + smallInteger)
  println("The smallest integer: $smallInteger")

  //Long Double Float Boolean Short Byte Char

  var Num1: Double = 1.111111
  var Num2 :Double = 2.22222
  println("Sum : " + (Num1 + Num2))

  //Boolean

  if(true is Boolean){
    println("True is boolean")
  }

  //output: A is a character : true
  var letter: Char = 'A'
  println("A is a character : ${letter is Char}")

  //Casting
  println("3.14 to Integer: " + (3.14.toInt()))
  println("letter to Integer: " + (letter.toInt()))
  println("65 to character: "+ (65.toChar()))

  //String
  val myName ="cat"
  val longSting =  " This is a long string "

  var fNname: String = "miao"
  var lName: String = "dog"

  fNname = "Sally"
  var fullName = fNname + " "+lName
  println("Name : $fullName")

  println("1+2 = ${1+2}")
  println("String length: ${longSting.length}")

  //to see string are equal or not
  //output String: String equal: false
  //equals return true/flase
  var str1 = "random string"
  var str2 = "Random string"
  println("String equal: ${str1.equals(str2)}")

  //output: Compare A to B: -1
  //compareTo -> 0 string is equal,
  //negative -> the value that's less than 0
  //positive -> the value that's greater than 0
  println("Compare A to B: ${"A".compareTo("B")}")

  // 2 ways to get index
  println("2nd Index: ${str1.get(2)}")
  println("2nd Index: ${str1[2]}")

  println("Index 2 - 7 ： ${str1.subSequence(2,8)}")

  println("Contains radom: ${str1.contains("random")}")

  /*--------------------------Array-----------------------------*/

   var myArray = arrayOf(1, 1.333, "cat")
   println(myArray[2])
  //change
  myArray[1] = 3.14
  //length
  println("array length: ${myArray.size}")
  //output:  cat in array:  true
  println("cat in array:  ${myArray.contains("cat")}")

  var partArray = myArray.copyOfRange(0,1)

  println("First : ${myArray.first()}")
  println("cat Index : ${ myArray.indexOf("cat")}")

  // 5 is the total indexes that we want inside of there
  // sqArray[3] = the index of 3 * itself = 3*3=9
  var sqArray = Array(5, {x -> x * x})
  println("sqArray[3] : " + sqArray[3])

  var arr2 : Array<Int> = arrayOf(1,2,3)

  /*--------------------------Range-----------------------------*/

  val  oneToten = 1..10
  val  alpha = "A".."Z"

  println(alpha) // A..Z

  //output: true
  println("R in Alpha : ${"R" in alpha}")

  val tenTo1 = 10.downTo(1)
  val twoTo20 = 2.rangeTo(20)
  for (y in twoTo20) print("$y") //234567891011121314151617181920


  val rang3 =  oneToten.step(3)
  for(x in rang3) print("rang3: $x") //rang3: 1rang3: 4rang3: 7rang3: 10

  println()
  //reverse
  for (x in tenTo1.reversed()) print("$x") //12345678910

  /*--------------------------Conditional-----------------------------*/
  println()


  val age = 20

  if(age < 5){
    print("you are a stupid")

  } else if (age == 5 ){
    print("you are dump")

  } else if ((age > 5) && (age <= 17)){
      val grade = age -5
    print("go to Grade $grade")

  } else{
    println( "you are so smart, you can go to college.")
  }

// using when
 val age2 =3
 when(age2){
   0,1,2,3,4 -> println("Go to preschool")
   5 -> println("go to kindergarten")

   in 6..17 ->{
     val grade = age2 -5
     println(" go to grade $grade")
   }

   else -> println("go to college")
 }


/*--------------------------Looping-----------------------------*/

  for (x in 1..10){
    print("Looping : $x")
  }

println()
//Random value

  val rand = Random()
  //find a random value from 1 to 50
  val magicNum = rand.nextInt(50) +1

  var guess = 0
  while(magicNum != guess){
    guess += 1
  }
  println("Magic Number was $guess ")


  for (x in 1..20){
  if(x % 2 ==0){
    continue
  }

  println("Odd:  $x")
  if (x ==15) break // 1 3  5 7 9 11 13 15

}
   var arr3: Array<Int> = arrayOf(3, 6, 9)
   for(i in arr3.indices){
     println("Mult 3 : ${arr3[i]}") //3, 6 ,9
    }


   for((index, value) in arr3.withIndex()){
     println(" Index : $index Value $value" )
   }
     // Index : 0 Value 3
     // Index : 1 Value 6
     // Index : 2 Value 9



}