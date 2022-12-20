package pattern

class RoundHole constructor(radius: Double) {
    var radius: Double = radius
        private set

    fun fits(peg: RoundPeg): Boolean {
        var result: Boolean
        result = (this.radius >= peg.getRadius()!!)
        return result
    }
}