import kotlin.math.pow
import kotlin.math.sqrt

class RoundHole constructor(radius: Double) {
    var radius: Double = radius
        private set

    fun fits(peg: RoundPeg): Boolean {
        var result: Boolean
        result = (this.radius >= peg.getRadius()!!)
        return result
    }
}

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

class SquarePeg constructor(width: Double) {
    var width: Double = width
        private set

    fun getSquare(): Double {
        var result: Double
        result = this.width.pow(2)
        return result
    }
}

class SquarePegAdapter constructor(peg: SquarePeg) : RoundPeg() {
    var peg: SquarePeg = peg
        private set

    override fun getRadius(): Double {
        return sqrt((peg.width / 2).pow(2) * 2)
    }
}