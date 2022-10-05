
fun main(){
    var x =5
    println("The value of x is $x")
//    with var, we can change the value of a variable
    x = 7
    println("The value of x is now $x")

    val y = 2
//    when we use the keyword val to declare a variable, we can't change the value of that variable in the program
    println("The value of y is $y")

    val iLoveVegetables = false
    println("It is $iLoveVegetables I love vegetables")

    val iAmALetter = 'R'
    println("My first name starts with $iAmALetter")

    val decimal = 3.64f
    println(decimal)//This is a decimal

//    In kotlin we don't need to explicitly define a data type during variable declaration
    val iLovePizza = true
    println("It is $iLovePizza that I love Pizza ")

    val d =7
    val w = d.toChar()
    println(w)

}