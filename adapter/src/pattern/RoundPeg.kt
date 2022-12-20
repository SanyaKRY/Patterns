package pattern

open class RoundPeg {
    private var radius: Double? = null
        private set


    constructor() {}

    constructor(radius: Double) {
        this.radius = radius
    }

    open fun getRadius(): Double? {
        return radius
    }
}