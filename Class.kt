fun main(args : Array<String>){

    val Laufen = Animal("Laufen", 5.00, 8.00)
    Laufen.getInfo()

    val Una = Cat("Una", 6.00, 9.00, "Fiona")
    Una.getInfo()

    val cheechi = Bird("cheechi", true)
    cheechi.fly(100.00)

}

open class Animal(val name: String , var height: Double, var weight: Double)
{
        //initial
        init {
            val regex = Regex(".*\\d+.*") //regular expression, it is the pattern
            require(!name.matches(regex)) {
                "Animal name can't contain numbers "}

                require(height >0){ "Height must be Greater than 0" }
                require(weight >0){ "Weight must be Greater than 0"}


        }

    //If you need the message in the method could be overridden, put open ahead

    open fun getInfo(): Unit {
        println("$name is $height tall, and weight $weight")
    }
}

/*--------------------------Inheritance-----------------------------*/

class Cat(name: String, height: Double, weight: Double, var owner: String ) :Animal(name, height, weight){

    override fun getInfo():Unit {
        println("$name is $height,and weight is $weight, and the owner is $owner")
    }
}

/*--------------------------Interface-----------------------------*/

interface Fly{
     var flies: Boolean
     fun fly(distance: Double): Unit
}

//constructor
class Bird constructor(val name: String, override var flies :Boolean = true) : Fly{
    override fun fly(distance: Double): Unit {
        if (flies){
            println("$name flies $distance miles" )
        }

    }

}