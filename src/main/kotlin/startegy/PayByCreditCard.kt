package singleton.startegy

import java.io.BufferedReader
import java.io.InputStreamReader

class PayByCreditCard : PayStrategy {

    private val reader: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    private var card: CreditCard? = null

    override fun pay(paymentAmount: Int): Boolean {
        if (cardIsPresent()) {
            println("Paying " + paymentAmount + " using Credit Card.")
            card?.amount = card!!.amount - paymentAmount
            return true
        } else {
            return false
        }
    }

    override fun collectPaymentDetails() {
        print("Enter the card number: ")
        var number: String = reader.readLine()
        print("Enter the card expiration date 'mm/yy': ")
        var date: String = reader.readLine()
        print("Enter the CVV code: ")
        var cvv: String = reader.readLine()
        card = CreditCard(number, date, cvv)
    }

    private fun cardIsPresent(): Boolean {
        return card != null
    }
}