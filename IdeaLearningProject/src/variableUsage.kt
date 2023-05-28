//Code sample to showcase the usage of different variables
var myNum  = 10
var myName : String = "Ram Kadambi"
var isMarried : Boolean = true

val returnedValue = superFunc()
fun main(){
    myNum = 20
    // returnedValue = 20 - val can't be reassigned - Useful for returned function value
    println("The Number is $myNum for the Name $myName - who's Married flag is $isMarried - the returnedValue is $returnedValue ")

    //Local variables with basic types
    var bin = 0b10011
    var hexa = 0xff81
    var b : Byte = 127
    var s : Short = -31999
    var i : Int = 200000000
    var l : Long = 3_500_000_000

    i = 3_500_000

    println(l)
    //print(24/5) will return integer
    print(24/5.toDouble())


    println("=======")
    var b1 = true
    var b2 = false
    println("b1 && b2 "  + (b1&&b2))
    println("b1 || b2 "  + (b1||b2))
    println("Not b2 "  + (!b2))

    //How array works
    var myArray : IntArray = intArrayOf(1,2,3,4,5,6)
    for(a in myArray)
        println(a)
    val myStringArray : Array<String> = arrayOf("Ram ", "Rasika ","Rahul")
    for (name in myStringArray)
        println(name)





}

fun superFunc() = 20
