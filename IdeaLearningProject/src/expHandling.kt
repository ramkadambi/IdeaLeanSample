fun main(){
    val myNumArray : IntArray = intArrayOf(5)

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
    var count = 5
    while(count > 1){
        println(" The current count is $count")
        count--
        if(count > 3 ) continue
        if(count == 2) break
        println(" The sometimes count is $count")
    }

}

fun someException(){
    throw Exception(" GOK ")

}