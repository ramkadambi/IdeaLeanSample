fun main(){
    var myNumArray : IntArray = intArrayOf(5)

    try{
        val myVal = myNumArray[0]
        println("Position value is $myVal")
    }
    catch (t: Throwable){
        println(t.message)
    }

    try{
        someException()
    } catch(e: Throwable)
    {
        println(e.message)
    } finally {
        println(" Thank god finally ")
    }

}

fun someException(){
    throw Exception()

}