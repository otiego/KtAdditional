import java.awt.Color

//
//class Car constructor(val make: String, val model: String, val color:String){
//
//    fun accelerate(){
//        println("vroom vroom")
//    }
//    fun display(){
//        println("The make of the car is $make and the model is $model")
//    }
//
//    fun details(){
//        println("This is a $color $make $model")
//    }
//}
//
//class Truck(val make: String, val model: String, val towingCapacity:Int){
//
//    fun tow(){
//        println("taking horses to the rodeo")
//    }
//
//    fun details(){
//        println("This is a $make $model with a tow capacity of $towingCapacity lbs")
//    }
//}

open class Vehicle(val make:String, val model:String){
    open fun accelerate(){
        println("vroom vroom")
    }
    fun park(){
        println("parking the vehicle")
    }
    fun brake(){
        println("STOP")
    }

}
class Car(make: String, model: String, var color:String): Vehicle(make, model){//creating class Car extending the Vehicle class
    override fun accelerate() {//we are overriding the accelerate method of Vehicle class
//        super.accelerate()
        println("we are going ludicrous mode!")
    }

}

class Truck(make: String,model: String,var towingCapacity:Int):Vehicle(make,model){//creating class truck extending the Vehicle class
    fun tow(){
        println("headed to the mountains!")
    }
}


fun main(args: Array<String>) {

    val tesla = Car("Tesla", "Model-S","Red")//creating an object for the car
    tesla.park()
    tesla.brake()
    tesla.accelerate()
    println("My drean car is a ${tesla.color}, ${tesla.make} ${tesla.model}")

    val truck = Truck("Volvo","F-16 Classic",12000)
    truck.tow()
    println("The towing capacity for ${truck.make} ${truck.model} is ${truck.towingCapacity}")
//    val car = Car("Toyota","Avalon","Black")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.display()
//    car.details()
//
//    val truck = Truck("Ford", "F-150",10000)//creating the object of the class
//    truck.tow()
//    println(truck.towingCapacity)
//    truck.details()

}