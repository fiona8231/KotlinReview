fun main(args : Array<String>){

    val map = mutableMapOf<Int, Any?>()
    val map2 = mutableMapOf(1 to "CAT", 2 to 34)

    map[1] = "miao"
    map[2] = 33

    println("Map size :${map.size}")
    map.put(3, "Lucy")
    map.remove(2)

    for ((x, y) in map){
        println("Key: $x  Value: $y")

    }

}
