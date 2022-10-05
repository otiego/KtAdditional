//Immutable Lists->Cannot be edited
fun main(){
    val shoppingList = listOf<String>("Ferrari", "Rolex", "Rolls Royce", "Mercedes Benz", "Toyota")
    print(shoppingList[1])

    //Mutable Lists->
    val item = mutableListOf("Car", "House", "Hotel")
    item.add("Watch")

    var counter = 0
    while (counter < item.size){
        println(item[counter])
        counter++
    }
    for (subItem in item){
        println(subItem )
    }
    }

