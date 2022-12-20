package pattern

class CreditCard {

    var amount: Int
    private var number: String
    private var date: String
    private var cvv: String

    constructor(number: String, date: String, cvv: String) {
        this.amount = 100_000
        this.number = number
        this.date = date
        this.cvv = cvv
    }
}