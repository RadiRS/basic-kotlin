import java.awt.Color

//class Car constructor(val make: String, val model: String, var color:String){ //constructor
//
//    fun accelerate(){
//        println("brumm brumm")
//    }
//
//    fun details(){
//        println("This is $color $make $model")
//    }
//}
//
//class Truck(val make:String, val model:String, val towCapacity:Int){ //class
//
//    fun tow(){
//        println("taking the horses to the rodeoo")
//    }
//
//    fun details(){
//        println("The $make $model has a towing capacity $towCapacity")
//    }
//}

open class Vehicle(val make:String, val model:String){ //class must open for inheritance

    open fun accelerated(){ //open for overide function in child class
        println("Brummmmm")
    }

    fun park(){
        println("Parking the vehicele")
    }

    fun  brake(){
        println("Stop")
    }

}

class Car(make: String, model: String, var color: String) : Vehicle(make, model){ //inheritance

    override fun accelerated() { //overide "accelereted" function in parent class
        println("Brummmm, brummmm")
        super.accelerated() // saparate with the parent class
    }
}

class Truck(make: String, model: String, var townCapacity: Int) : Vehicle(make, model){

    fun tow(){
        println("this is truck")
    }

}


fun main(args: Array<String>) {

//    val car = Car("Toyota", "Avalon","Red") //instance class
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//
//    val truck = Truck("Ford","F102", 1000) //instance class
//    truck.tow()
//    truck.details()

    val tesla = Car("Telsa", "Model12","Red")
    tesla.accelerated()

    val truck = Truck("Ford", "F333", 10000)
    truck.accelerated()
}