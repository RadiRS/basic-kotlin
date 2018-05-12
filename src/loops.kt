fun main(args: Array<String>) {

    val rebels = arrayListOf("Leith", "Maga", "Degea", "Sseide")
    val rebelsVechi = hashMapOf("Solo" to "Millenium Folcon", "Look" to "Lanspere", "Boba" to "Roccket back")

    for (rebel in rebels){
        println("Name : $rebel")
    }

    for ((key, value) in rebelsVechi){
        println("$key gets around ther $value")
    }

    var x = 10
    while (x > 0){
        println(x)
        x--
    }

}