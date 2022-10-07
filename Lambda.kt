fun main(args: Array<String>) {
    val printMessage = {message:String -> println(message)}
    printMessage("Hello World")

    val sumA = {a:Int,b:Int -> a+b}//declaring type inside lambda
    println(sumA(8, 9))

//    declaring type outside lambda
    val sumB:(Int,Int) -> Int ={x,y -> x+y}
    println(sumB(8,6))

    fun downloadData(url:String, completion:() -> Unit){
//        sent a download request
//        we got back data
//        there were no network errors
        completion()
    }
//    call download data function
    downloadData("fakeUrl.com",{
        println("The code in this block will " +
                "run after completion()")
    })

    fun downloadCarData(url:String, completion: (Car) -> Unit) {
        //sent a download request
        // we got back car data
        val car = Car("Tesla", "Model-S", "Blue")
        completion(car)
    }
        downloadCarData("fakeUrl.com"){ car ->
            println(car.make)
            println(car.model)
        }

        fun downloadTruckData(url:String,completion: (Truck?,Boolean) -> Unit){
            //sent a download request
            // we got the results back
            val webRequestSuccess = true
            if (webRequestSuccess){
//                received truck data
                val truck = Truck("Scania","Topline",15000)
                completion(truck,true)
            }
            else{
                completion(null,false)
            }
        }
        downloadTruckData("fakeUrl.com"){truck, success ->
            if (success){
//               do something with our truck
                truck?.tow()
            }
            else{
//                handle the web request failure
                println("Something went wrong")
            }

        }
    }
