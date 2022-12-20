package pattern

import pattern.model.Car

class TripComputer {
    var car: Car? = null

    fun showFuelLevel() {
        System.out.println("Fuel level: " + car?.fuel)
    }

    fun showStatus() {
        if (this.car?.engine?.started == true) {
            System.out.println("pattern.model.Car is started")
        } else {
            System.out.println("pattern.model.Car isn't started")
        }
    }
}