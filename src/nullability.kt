fun main(args: Array<String>) {

    var name: String = "Jhonny" //can not null
//    name = nuul

    var nullableNmae: String? = "Do i really axist ?" //can null
//    nullableNmae = null
    var length = 0

    //null check
    if (nullableNmae != null){
        length = nullableNmae.length
    } else {
        length = -1
    }

    println(length)

    val l = if (nullableNmae != null) nullableNmae.length else -1 //similiar if else
    println(l)

    //second method safe call aporator ?
    println(nullableNmae?.length)

    //third method is Elvis Operator
    val len = nullableNmae?.length ?: -1 //similiar if else
    val noName = nullableNmae ?: "No one knows me"
    println(noName)

    // !!
    println(nullableNmae!!.length) // for display error


}