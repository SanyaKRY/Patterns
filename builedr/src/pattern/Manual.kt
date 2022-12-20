package pattern

import pattern.model.Transmission
import pattern.model.CarType
import pattern.model.Engine
import pattern.model.GPSNavigator

class Manual constructor(carType: CarType, seats: Int, engine: Engine, transmission: Transmission, tripComputer: TripComputer?, gPSNavigator: GPSNavigator) {
    val carType: CarType = carType
    val seats: Int = seats
    val engine: Engine = engine
    val transmission: Transmission = transmission
    val tripComputer: TripComputer?  = tripComputer
    val gPSNavigator: GPSNavigator = gPSNavigator

    fun print(): String {
        return "Info: " + carType + " " + seats + " " + engine.volume + " " + engine.mileage + " " + transmission +" " + tripComputer + " " + gPSNavigator
    }
}