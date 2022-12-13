package builder

class CarBuilder : Builder {

    private var carType: CarType? = null
    private var seats: Int? = null
    private var engine: Engine? = null
    private var transmission: Transmission? = null
    private var tripComputer: TripComputer?  = null
    private var gPSNavigator: GPSNavigator? = null

    fun getResult(): Car {
        return Car(carType!!, seats!!, engine!!, transmission!!, tripComputer, gPSNavigator!!)
    }

    override fun setCarType(type: CarType) {
        this.carType = type
    }

    override fun setSeats(seats: Int) {
        this.seats = seats
    }

    override fun setEngine(engine: Engine) {
        this.engine = engine
    }

    override fun setTransmission(transmission: Transmission) {
        this.transmission = transmission
    }

    override fun setTripComputer(tripComputer: TripComputer) {
        this.tripComputer = tripComputer
    }

    override fun setGPSNavigator(gpsNavigator: GPSNavigator) {
        this.gPSNavigator = gpsNavigator
    }
}
