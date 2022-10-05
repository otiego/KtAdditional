fun main() {
    val str = "May the force be with you."
    println(str)

    val str1 = "My father said the funniest thing he said \"a joke\" "
    println(str1)

//    Next line escape character
    val str2 = "Select your best brand\nMercedes\nFerrari\nRollsRoice"
    println(str2)

//    Tabs Escape character
    val str3 = "This adds a\t space in a string"
    println(str3)

//    Backspace escape character
    val str4 = "May the force\b be with you."
    println(str4)

    val str5 = "May the force\r be with you."
    println(str5)

    val str6 = "May the force\$ be with you."
    println(str6)
//    Roller strings
//.trimMargin removes the default white space, but we have to put pipes(|)
    val rawCrawl = """|A long time ago,
        |in a galaxy
        |far, far, away...
        |BUMM BUMM BUMMM
    """.trimMargin()
    println(rawCrawl)
//pipe is the default but you can set any character you
//        val rawCrawl = """>A long time ago,
//        >in a galaxy
//        >far, far, away...
//        >BUMM BUMM BUMMM
//    """.trimMargin(">")

//    Strings are array or list of characters
//    for (char in str){
//        println(char)
//    }

//    Comparing strings
    val myName = "Ronald"
    val hisName = "Sam"

    val contentEquals = myName.contentEquals(hisName)
    println(contentEquals)

    val contains = str.contains("Force",false)
    print(contains)

    val upperCase = str.toUpperCase()
    val lowerCase =str.toLowerCase()

    println(upperCase)
    println(lowerCase)

    val num =6
    val stringNum = num.toString()
    println(stringNum)

    //useful when you have a string and you only want to use part of it
    val subsequence = str.subSequence(4,13)
    println(subsequence)

    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 46
    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle and is $age years old")
    println("Luke's full name $luke has ${luke.length} characters")
}



