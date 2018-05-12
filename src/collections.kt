fun main(args: Array<String>) {

    val imperials = listOf("Emperor", "Dart Vader", "Bobo", "Tarkia")
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.first())
    println(imperials.last())
    println(imperials.contains("Emperor"))
    println(imperials)

    val rebels = arrayListOf("Leith", "Maga", "Degea", "Sseide")
    println(rebels.size)
    rebels.add("Cheweked")
    println(rebels)
    rebels.add(0, "First")
    println(rebels)
    println(rebels.indexOf("Maga"))
    rebels.remove("Maga")
    println(rebels)

    val rebelsMap = mapOf("Solo" to "Millenium Folcon", "Look" to "Lanspere") //key and value like associative array
    println(rebelsMap["Solo"])
    println(rebelsMap.get("Solo"))
    println(rebelsMap.getOrDefault("Leeih", "This ship dosn't exist"))
    println(rebelsMap.values)

    val rebelsVechi = hashMapOf("Solo" to "Millenium Folcon", "Look" to "Lanspere", "Boba" to "Roccket back")
    rebelsVechi["Solo"] = "Xwing"
    rebelsVechi.put("Leeih", "Tantive v")
    println(rebelsVechi)
    rebelsVechi.remove("Boba")
    println(rebelsVechi)
    rebelsVechi.clear()
    println(rebelsVechi)


}