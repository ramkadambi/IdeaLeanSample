fun main(){
    println("Hello world")
    /*
    var sumValue : Int = 0
    sumValue = sum(20, 30)
    println(sumValue)
    */
     var sumValue : Int = sum(20,30)
    println(sumValue)
    sumValue = sum2(30, 40 )
    println(sumValue)
    doNothing()

}

fun sum(a: Int, b: Int) : Int {
    return a+b
}

fun doNothing() : Unit = println("Nothing is being Done")
//The Java has more ceremony of adding the return type.
// In Kotlin, we have default Unit representing Void


fun sum2(a: Int, b: Int) : Int = a+ b
