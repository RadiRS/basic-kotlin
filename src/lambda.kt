fun main(args: Array<String>) {

    val printMassage = { massage: String -> println(massage)} //function not diclare
    printMassage("Hello")

    val sumA = {x: Int, y: Int -> println(x + y)}
    val sumB : (Int, Int) -> Int = {x,y -> x+y} //same
    sumA(2,5)

    fun downloadData(url: String, completetion: ()-> Unit){ //call download data function
        // sent a download request
        // we got back data
        // there were not network erorrs
        completetion()
    }

    downloadData("fakeUrl.com",{
        println("The code in this block, will only run after the completion()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit){
        // sent a download request
        // we got back a car data
        val car = Car("Telss", "Modelx", "Blue")
        completion(car)
    }

    downloadCarData("fakeUrl.com"){ car ->
        println(car.color)
        println(car.make)
        println(car.model)
    }

    downloadCarData("fakeUrl.com"){  //if just one parameter
        println(it.color)
        println(it.make)
        println(it.model)
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit){
        //make the web request
        //we get the request back
        val webRequestSuccec = false //tempp for check request
        if (webRequestSuccec){
            //receive truck data
            val truck = Truck("Ford","F3333",2929393)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeUrl.com"){truck, success ->
        if (success == true){
            //do something with our truck
            truck?.tow()
        } else {
            //hendle the web request failure
            println("Something wrong")
        }
    }

}