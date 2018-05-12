fun main(args: Array<String>) {
    val str = "May the force be with you"
    println(str)

    val str1 = "My dad said"
//    val rawCrawl = """ |A kljasldkfjl k dslkf ,
//        |ksjf;aksdjfio alskdfj pasd kk
//        |lsadkjf;laskjf as;fkl;
//        |lkj;askdjf """.trimMargin()
//
//    println(rawCrawl)

//    for (char in str){
//        println(char)
//    }

    val contentEquals = str.contentEquals("May the force be with you") // check the same value
    println(contentEquals)

    val contains = str.contains("force", true) //check if the value exist in variable

    val uppercase = str.toUpperCase()
    val lowercase = str.toLowerCase()
    println(uppercase + "\n" + lowercase + "\n" + contains)

    val subsecuence = str.subSequence(2, 9) //sub text in varible
    println(subsecuence)

    val string1 = "string 1"
    val string2 = "string 2"
    val string3 = "string 3"
    val integer = 12
    println("Variable 1:$string1, variable 2:$string2, variable 3:$string3, and integer:$integer") //tamplate string

    println("$string1 has a ${string1.length} character")

}