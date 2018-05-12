fun main(args: Array<String>) {

    val a = 2
    val b = 2

    // == >= <= != < >
    if (a == b){
        println("Aquels")
    }
    if (a != b){
        println("Not Aquels")
    }

    val accountBalance = 100
    val price = 50

    if (accountBalance >= price){
        println("You can buy")
    }else{
        println("Sorry")
    }

    val degre = 70
    if (degre >= 70){
        println("Hot")
    }else if (degre < 70 && degre >= 50){
        println("Good")
    }else{
        println("Cold")
    }

    val isHungry = false
    val isBorry = true

    if (isHungry || isBorry){
        println("Lets get pizza")
    }

    val x = 1 //switch
    when (x){
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x doesn't equels 1 or 2")
    }

    fun vaderIsFelling(mood: String = "Anggr"){
        if (mood == "Angry"){
            println("True")
        }else {
            println("False")
        }
    }

    vaderIsFelling("Angry")






}