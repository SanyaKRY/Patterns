package pattern

import java.io.BufferedReader
import java.io.InputStreamReader

class PayByPayPal : PayStrategy {

    var dataBase:HashMap<String, String> = HashMap<String, String>()
    private val reader: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    private var email: String? = null
    private var password: String? = null
    private var signedIn: Boolean = false

    init {
        dataBase.put("amanda1985", "amanda@ya.com")
        dataBase.put("qwerty", "john@amazon.eu")
    }

    override fun pay(paymentAmount: Int): Boolean {
        if (signedIn!!) {
            println("Paying " + paymentAmount + " using PayPal.")
            return true
        } else {
            return false
        }
    }

    override fun collectPaymentDetails() {
        while (!signedIn) {
            print("Enter the user's email: ")
            email = reader.readLine()
            print("Enter the password: ")
            password = reader.readLine()
            if (verify()) {
                println("Data verification has been successful.")
            } else {
                println("Wrong email or password!")
            }
        }
    }

    private fun verify(): Boolean {
        setSignedIn(email.equals(dataBase.get(password)))
        return signedIn!!
    }

    private fun setSignedIn(signedIn: Boolean) {
        this.signedIn = signedIn
    }
}