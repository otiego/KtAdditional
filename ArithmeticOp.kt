
fun main(){
    val x = 5
    val y=2.5
    println(x/y)

    val a = 10%3
    println("The value of a is $a")

    val d = 7*6
    println("The value of d is $d")

    val s = 5%2
    println("The value of s is $s")

//Logical operator
    val iAmAdult = true
    val iAmProgrammer = true
    val iAmAdultProgrammer = iAmAdult && iAmProgrammer
    println("It is $iAmAdultProgrammer I am an adult programmer")

    //special libraries in Kotlin
    val e = "Kotlin is the best programming language for Android Development"
    println(e.toUpperCase())
    println(e.toLowerCase())

//    Getting values from user
//    print("Enter a number")
    val number1 = readLine()?:"0"//the readLine() function takes only strings
    val number2 = readLine()?:"0"
    val result = number1.toInt() + number2.toInt()//Kotlin cannot add strings. We must convert the strings received to integer using .Int() function
    println(result)
}