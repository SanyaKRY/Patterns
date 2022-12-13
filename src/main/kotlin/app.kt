package singleton

import RoundHole
import RoundPeg
import SquarePeg
import SquarePegAdapter
import builder.*
import singleton.decorator.Pizza
import singleton.decorator.RegularExtra
import singleton.observer.Editor
import singleton.observer.EmailNotificationListener
import singleton.observer.LogOpenListener
import singleton.startegy.Order
import singleton.startegy.PayByCreditCard
import singleton.startegy.PayByPayPal
import singleton.startegy.PayStrategy
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
//    println("Hello kotlin")
//    println()
//    Singleton.printValue()
//    println(Singleton.value)
//
//    println("SingletonWithParameters")
//    println("kotlin singleton class with parameters")
//    println("to implement parameters we need a normal class, having a companion object and private default constructors")
//    SingletonWithParameters.getInstance(Config()).printConfig()
//    SingletonWithParameters.getInstance(Config()).printConfig()
//    SingletonWithParameters.getInstance(Config()).printConfig()

//    var director: Director = Director()
//    var carBuilder: CarBuilder = CarBuilder()
//    director.constructSportsCar(carBuilder)
//    var car: Car = carBuilder.getResult()
//    println("Car built:\n" + car.carType)
//    var manualBuilder: CarManualBuilder = CarManualBuilder()
//    director.constructSportsCar(manualBuilder)
//    var carManual:Manual = manualBuilder.getResult()
//    println("\nCar manual built:\n" + carManual.print())

//    var hole: RoundHole = RoundHole(5.0)
//    var rpeg: RoundPeg = RoundPeg(5.0)
//    if (hole.fits(rpeg)) {
//        println("Round peg r5 fits round hole r5.")
//    }
//    var smallSqPeg: SquarePeg = SquarePeg(2.0)
//    var largeSqPeg: SquarePeg = SquarePeg(20.0)
//    var smallSqPegAdapter: SquarePegAdapter = SquarePegAdapter(smallSqPeg)
//    var largeSqPegAdapter: SquarePegAdapter = SquarePegAdapter(largeSqPeg)
//    if (hole.fits(smallSqPegAdapter)) {
//        println("Square peg w2 fits round hole r5.")
//    }
//    if (!hole.fits(largeSqPegAdapter)) {
//        println("Square peg w20 does not fit into round hole r5.")
//    }

//    var fourSeasonsPizza: Order = Pizza("Four Seasons Pizza", 10.0)
//    fourSeasonsPizza = RegularExtra("Pepperoni", 4.0, fourSeasonsPizza)
//    fourSeasonsPizza = RegularExtra("Mozzarella", 2.0, fourSeasonsPizza)
//    fourSeasonsPizza = RegularExtra("Chili", 2.0, fourSeasonsPizza)
//    println(fourSeasonsPizza.getPriceOrder())
//    println(fourSeasonsPizza.getLabelOrder())


//    var editor: Editor = Editor()
//    editor.events.subscribe("open", LogOpenListener("file.txt"))
//    editor.events.subscribe("save", EmailNotificationListener("admin@example.com"))
//    editor.openFile("test.txt")
//    editor.saveFile()


//    var priceOnProducts:HashMap<Int, Int> = HashMap<Int, Int>()
//    priceOnProducts.put(1, 2200)
//    priceOnProducts.put(2, 1850)
//    priceOnProducts.put(3, 1100)
//    priceOnProducts.put(4, 890)
//    var reader: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
//    var order: Order = Order()
//    var strategy: PayStrategy? = null
//    while (!order.isClosed()) {
//        var cost: Int?
//        var continueChoice: String
//        do {
//            print("Please, select a product:" + "\n" +
//                    "1 - Mother board" + "\n" +
//                    "2 - CPU" + "\n" +
//                    "3 - HDD" + "\n" +
//                    "4 - Memory" + "\n")
//            var choice: Int  = Integer.parseInt(reader.readLine())
//            cost = priceOnProducts.get(choice)
//            print("Count: ")
//            var count: Int = Integer.parseInt(reader.readLine())
//            order.totalCost = cost!! * count
//            print("Do you wish to continue selecting products? Y/N: ")
//            continueChoice = reader.readLine()
//        } while (continueChoice.equals("Y", ignoreCase = true))
//        if (strategy == null) {
//            println("Please, select a payment method:" + "\n" +
//                    "1 - PalPay" + "\n" +
//                    "2 - Credit Card")
//            var paymentMethod: String = reader.readLine()
//            if (paymentMethod.equals("1")) {
//                strategy = PayByPayPal()
//            } else {
//                strategy = PayByCreditCard()
//            }
//        }
//        order.processOrder(strategy)
//        print("Pay " + order.totalCost + " units or Continue shopping? P/C: ")
//        var proceed: String = reader.readLine()
//        if (proceed.equals("P", ignoreCase = true)) {
//            if (strategy.pay(order.totalCost)) {
//                println("Payment has been successful.")
//            } else {
//                println("FAIL! Please, check your data.")
//            }
//            order.setClosed()
//        }
//    }
}