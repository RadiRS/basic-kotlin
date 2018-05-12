fun main(args: Array<String>) {

    fun forceChoke(){ // function
        println("You have failed me for the last time admiral")
    }

    forceChoke()

    fun makeAnEntrance(line: String){ // function with parameter
        println(line)
    }

    makeAnEntrance("I  find you")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int{ //function return type int
        val goodGuys = rebels + ewoks
        return  goodGuys
    }

    val rebels = calculateNumberGoodGuys(5, 7)
    println("Darth vader faced off agains $rebels rebel scum")

    fun vaderIsFeeling(mood: String = "Anggry"){
        println(mood)
    }

    vaderIsFeeling()

}