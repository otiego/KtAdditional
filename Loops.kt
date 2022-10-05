fun main(args: Array<String>) {
    val rebels = arrayListOf("Madlobo", "Leiah", "Niklause", "Han Solo", "Chris")
    val rebelVehiclesMap = hashMapOf( "Solo" to "Millenium", "Luke" to "Landspeeder", "Boba Fette" to "Rocket Pack")


    val counter =0
    for (rebel in rebels){
        println("Name: $rebel")
//        rebels.indexOf("ui")
    }
    for ((key, value) in rebelVehiclesMap){
        println("$key gets around in their $value")
    }

    var x =0
    while (x<=10){
        println(x)
        x++
    }
}