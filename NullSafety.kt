fun main(args : Array<String>){

//by default, we CAN NOT assign null

   // var nullValue: String = null // the wrong way to do

    //the correct way

    var nullValue :String? = null

    //If a function may return null

    fun returnNullFunc() :String?{
        return null
    }

   var nullValue2 = returnNullFunc()
    if (nullValue1 !=null){

        println("nullValue2.length")
    }
    var nullValue2 = nullValue1!!.length

    var nullValue4 :String = returnNullFunc() ?: "NO MAME"

}