package pattern

import pattern.RoundPeg
import pattern.SquarePeg
import kotlin.math.pow
import kotlin.math.sqrt

class SquarePegAdapter constructor(peg: SquarePeg) : RoundPeg() {
    var peg: SquarePeg = peg
        private set

    override fun getRadius(): Double {
        return sqrt((peg.width / 2).pow(2) * 2)
    }
}