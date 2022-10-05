fun main(args: Array<String>) {
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkish")
    println(imperials)
    println(imperials.size)
    println(imperials[2])
    println(imperials.sorted())
    println(imperials.contains("Emperor"))
    println(imperials.first())
    println(imperials.last())

    //Mutabale lists called arrayList
    val rebels = arrayListOf("Madlobo", "Leiah", "Niklause", "Han Solo", "Chris")
    println(rebels.size)
    rebels.add("Juke")
    println(rebels)
    rebels.add(1, "Mahtma ")
    println(rebels)
    println(rebels.indexOf("Han Solo"))
    rebels.remove("Niklause")
    println(rebels)
    println("-------------------------------------------------------------------------------")//seperator
    //Maps
    //Maps are unordered key-value pair
    val rebelVehicles = mapOf("Solo" to "Millenium", "Luke" to "Landspeeder")
    println(rebelVehicles["Solo"])
    println(rebelVehicles.get("Luke"))
    println(rebelVehicles.getOrDefault("Saul","This ship doesn't exist"))
    println(rebelVehicles.values)
    println("-------------------------------------------------------------------------------")//seperator

    val rebelVehiclesMap = hashMapOf( "Solo" to "Millenium", "Luke" to "Landspeeder", "Boba Fette" to "Rocket Pack")
    rebelVehiclesMap["Luke"] = "XWing"
    rebelVehiclesMap.put("Leiah", "TativeIV")
    println(rebelVehiclesMap)
    rebelVehiclesMap.remove("Boba Fette")
    println(rebelVehiclesMap)
    rebelVehiclesMap.clear()
    val e = rebelVehiclesMap.isEmpty()
    println(e)



}