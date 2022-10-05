fun main(){
    println("Enter a number:")
    val x = readLine()?:"0"
    if (x.toInt() % 2 == 0){
        println("$x is an even number")
    }
    else
        println("$x is an odd number")

    val y =3+8
     if (y == 4){
         print("y is 4")
     }
    else if(y==5){
        println("y is 5")
    }
    else
         println("Y is not 4 or 5")

    val num = 11
    var i = 2
    var flag = false
    while (i <= num / 2) {
        // condition for nonprime number
        if (num % i == 0) {
            flag = true
            break
        }
        ++i
    }

    if (!flag)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")

//    difference in kotlin
//    val b = if (x.toInt()==2) 2 else 3
//    println(b)
    val r=4
    when(r){
        in 1..3 -> println("r in the range of 1 and 3")
        in 3..10 -> println("r in the range of 3 and 10")
        else->{
            println("r is not in the range")
        }
    }


}