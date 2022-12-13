package builder

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

class TripComputer {
    var car: Car? = null

    fun showFuelLevel() {
        System.out.println("Fuel level: " + car?.fuel)
    }

    fun showStatus() {
        if (this.car?.engine?.started == true) {
            System.out.println("Car is started")
        } else {
            System.out.println("Car isn't started")
        }
    }
}

class Engine constructor(mileage: Double, volume: Double) {

    val volume: Double = volume

    var mileage: Double = mileage
        private set

    var started: Boolean? = null
        private set

    fun on() {
        started = true
    }

    fun off() {
        started = false
    }

    fun go(mileage: Double) {
        if (started!!) {
            this.mileage += mileage
        } else {
            System.err.println("Cannot go(), you must start engine first!")
        }
    }
}

class GPSNavigator {
    var router: String
        private set

    constructor() {
        router = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London"
    }

    constructor(manualRoute: String) {
        router = manualRoute
    }
}

enum class Transmission {
    SINGLE_SPEED, MANUAL, AUTOMATIC, SEMI_AUTOMATIC
}

enum class CarType {
    CITY_CAR, SPORTS_CAR, SUV
}
