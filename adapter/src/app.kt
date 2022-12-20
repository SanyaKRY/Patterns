import pattern.RoundHole
import pattern.RoundPeg
import pattern.SquarePeg
import pattern.SquarePegAdapter

fun main() {

    var hole: RoundHole = RoundHole(5.0)
    var rpeg: RoundPeg = RoundPeg(5.0)
    if (hole.fits(rpeg)) {
        println("Round peg r5 fits round hole r5.")
    }
    var smallSqPeg: SquarePeg = SquarePeg(2.0)
    var largeSqPeg: SquarePeg = SquarePeg(20.0)
    var smallSqPegAdapter: SquarePegAdapter = SquarePegAdapter(smallSqPeg)
    var largeSqPegAdapter: SquarePegAdapter = SquarePegAdapter(largeSqPeg)
    if (hole.fits(smallSqPegAdapter)) {
        println("Square peg w2 fits round hole r5.")
    }
    if (!hole.fits(largeSqPegAdapter)) {
        println("Square peg w20 does not fit into round hole r5.")
    }
}