import pattern.Order
import pattern.Pizza
import pattern.RegularExtra

fun main() {
    var fourSeasonsPizza: Order = Pizza("Four Seasons pattern.Pizza", 10.0)
    fourSeasonsPizza = RegularExtra("Pepperoni", 4.0, fourSeasonsPizza)
    fourSeasonsPizza = RegularExtra("Mozzarella", 2.0, fourSeasonsPizza)
    fourSeasonsPizza = RegularExtra("Chili", 2.0, fourSeasonsPizza)
    println(fourSeasonsPizza.getPriceOrder())
    println(fourSeasonsPizza.getLabelOrder())
}