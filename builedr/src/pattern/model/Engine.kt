package pattern.model

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