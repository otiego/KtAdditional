
class Car constructor(val make: String, val model: String, val color:String){

    fun accelerate(){
        println("vroom vroom")
    }
    fun display(){
        println("The make of the car is $make and the model is $model")
    }

    fun details(){
        println("This is a $color $make $model")
    }
}

class Truck(val make: String, val model: String, val towingCapacity:Int){

    fun tow(){
        println("taking horses to the rodeo")
    }

    fun details(){
        println("This is a $make $model with a tow capacity of $towingCapacity lbs")
    }
}

fun main(args: Array<String>) {
    val car = Car("Toyota","Avalon","Black")
    println(car.make)
    println(car.model)
    car.accelerate()
    car.display()
    car.details()

    val truck = Truck("Ford", "F-150",10000)//creating the object of the class
    truck.tow()
    println(truck.towingCapacity)
    truck.details()

}