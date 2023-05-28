//Code sample to showcase the usage of different variables
var myNum  = 10
var myName : String = "Ram Kadambi"
var isMarried : Boolean = true

val returnedValue = superFunc()
fun main(){
    myNum = 20
    // returnedValue = 20 - val can't be reassigned - Useful for returned function value
    println("The Number is $myNum for the Name $myName - who's Married flag is $isMarried - the returnedValue is $returnedValue ")

}

fun superFunc() = 20
