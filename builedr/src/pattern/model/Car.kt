package pattern.model

import pattern.TripComputer

class Car constructor(carType: CarType, seats: Int, engine: Engine, transmission: Transmission, tripComputer: TripComputer?, gPSNavigator: GPSNavigator) {
    val carType: CarType = carType
    val seats: Int = seats
    val engine: Engine = engine
    val transmission: Transmission = transmission
    var tripComputer: TripComputer?  = tripComputer
        set(value) {
            field = value
            if (value != null) {
                this.tripComputer?.car = this
            }
        }
    val gPSNavigator: GPSNavigator = gPSNavigator
    var fuel: Double = 0.0
}