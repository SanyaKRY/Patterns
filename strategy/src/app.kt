import pattern.Order
import pattern.PayByCreditCard
import pattern.PayByPayPal
import pattern.PayStrategy
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    var priceOnProducts:HashMap<Int, Int> = HashMap<Int, Int>()
    priceOnProducts.put(1, 2200)
    priceOnProducts.put(2, 1850)
    priceOnProducts.put(3, 1100)
    priceOnProducts.put(4, 890)
    var reader: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var order: Order = Order()
    var strategy: PayStrategy? = null
    while (!order.isClosed()) {
        var cost: Int?
        var continueChoice: String
        do {
            print("Please, select a product:" + "\n" +
                    "1 - Mother board" + "\n" +
                    "2 - CPU" + "\n" +
                    "3 - HDD" + "\n" +
                    "4 - Memory" + "\n")
            var choice: Int  = Integer.parseInt(reader.readLine())
            cost = priceOnProducts.get(choice)
            print("Count: ")
            var count: Int = Integer.parseInt(reader.readLine())
            order.totalCost = cost!! * count
            print("Do you wish to continue selecting products? Y/N: ")
            continueChoice = reader.readLine()
        } while (continueChoice.equals("Y", ignoreCase = true))
        if (strategy == null) {
            println("Please, select a payment method:" + "\n" +
                    "1 - PalPay" + "\n" +
                    "2 - Credit Card")
            var paymentMethod: String = reader.readLine()
            if (paymentMethod.equals("1")) {
                strategy = PayByPayPal()
            } else {
                strategy = PayByCreditCard()
            }
        }
        order.processOrder(strategy)
        print("Pay " + order.totalCost + " units or Continue shopping? P/C: ")
        var proceed: String = reader.readLine()
        if (proceed.equals("P", ignoreCase = true)) {
            if (strategy.pay(order.totalCost)) {
                println("Payment has been successful.")
            } else {
                println("FAIL! Please, check your data.")
            }
            order.setClosed()
        }
    }
}