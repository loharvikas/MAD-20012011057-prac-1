fun main() {
    val car1 = Car("Lambo, 2018", "Vikas", 115, 100000.0, 98950.0)
    car1.getCarFullDetails()
    val car2 = Car("BMW, 2019", "Shaha", 120, 400000.0, 399800.0)
    car2.getCarFullDetails()
    val Cars = ArrayList<Car> (2)
    val car3 = Car("Audi, 2017","Ducati",50,1080000.0,1079000.0)
    val car4 = Car("Suzuki, 2020","Karan",20,4000000.0,3998000.0)
    Cars.add(car3)
    Cars.add(car4)
    for (i in Cars){
        println("-------------------")
        i.getCarFullDetails()
    }
}
class Car(private val model: String, private val owner: String, private val miles: Int, private val original: Double, private val current: Double) {
    init {
        println("Object of class is Created and Init is Called.")
    }
    private fun info(): String {
        return model
    }
    private fun carowner(): String {
        return owner
    }
    private fun milesDrive(): Int {
        return miles
    }
    private fun orgprice(): Double {return original
    }
    private fun currprice(): Double {
        return current
    }
    fun getCarFullDetails() {
        println("----------")
        println("Car Information : ${info()}")
        println("Car owner : ${carowner()}")
        println("Miles Drive : ${milesDrive()}")
        println("Original Car Price : ${orgprice()}")
        println("Current Car Price : ${currprice()}")
        println("----------\n")
    }
}
        println("Car Information : ${info()}")
        println("Car owner : ${carowner()}")
        println("Miles Drive : ${milesDrive()}")
        println("Original Car Price : ${orgprice()}")
        println("Current Car Price : ${currprice()}")
        println("----------\n")
    }
}
