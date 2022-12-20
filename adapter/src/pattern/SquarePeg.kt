package pattern

import kotlin.math.pow

class SquarePeg constructor(width: Double) {
    var width: Double = width
        private set

    fun getSquare(): Double {
        var result: Double
        result = this.width.pow(2)
        return result
    }
}