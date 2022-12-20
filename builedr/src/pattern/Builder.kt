package pattern

import pattern.model.CarType
import pattern.model.Engine
import pattern.model.GPSNavigator
import pattern.model.Transmission

interface Builder {

    fun setCarType(type: CarType)
    fun setSeats(seats: Int)
    fun setEngine(engine: Engine)
    fun setTransmission(transmission: Transmission)
    fun setTripComputer(tripComputer: TripComputer)
    fun setGPSNavigator(gpsNavigator: GPSNavigator)
}