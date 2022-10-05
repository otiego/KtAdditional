fun main(args: Array<String>) {
    fun sayHello(){
        //function body
        println("Hello there")
    }
    sayHello()//calling the function

    fun product(a:Double,b:Double){
//        val c =a*b
//        println(c.toInt())
        println(a*b)
    }
    product(7.9,7.7)

    fun makeAnEntrance(line:String){
        println(line)
    }
    makeAnEntrance("You should get an invitation to a vampires place")

    fun printFriendsName(name:String):String{
        return name
    }

    val friendsName = printFriendsName("Sam")
    println("My friend's name is called $friendsName")

    fun sum(a:Int, b:Int):Int{
        return a+b
    }
    val add = sum(8,9)
    println("Sum of the two numbers is $add")
    println("Sum of the two numbers is ${sum(8,45)}")//calling the function directly

    fun ronald(mood:String = "happy"){
        println("Ronald is ${mood.toUpperCase()}")
    }
    ronald("joyful")//overrides the default values set

}


