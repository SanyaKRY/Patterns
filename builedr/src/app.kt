import pattern.CarBuilder
import pattern.CarManualBuilder
import pattern.Director
import pattern.Manual
import pattern.model.Car

fun main() {

    var director: Director = Director()
    var carBuilder: CarBuilder = CarBuilder()
    director.constructSportsCar(carBuilder)
    var car: Car = carBuilder.getResult()
    println("pattern.model.Car built:\n" + car.carType)
    var manualBuilder: CarManualBuilder = CarManualBuilder()
    director.constructSportsCar(manualBuilder)
    var carManual: Manual = manualBuilder.getResult()
    println("\npattern.model.Car manual built:\n" + carManual.print())
}