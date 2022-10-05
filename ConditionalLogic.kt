fun main(args: Array<String>) {

    val a = 2
    val b = 8

    if (a == b){
        println("a and b are equal")
    }
    else
        println("a does not equal b")

    val accountBalance =100
    val price = 50
    if (accountBalance >= price){
        println("You can buy")
    }
    else
        println("sorry you're broke")

    val degrees = 18
    if (degrees >= 70){
        println("This is a hot weather, you should turn ac on AC")
    }
    else if (degrees >=50 && degrees<70){
        println("The weather is awesome")
    }
    else
        println("grab a sweater")

    val x = 3
    when(x){
        1 -> println("x == 1")
        2 -> println("x == 2")
        else-> println("x is neither 1 nor 2")
    }

    fun bellaIsFeeling(mood:String="happy"){
         
    }
}