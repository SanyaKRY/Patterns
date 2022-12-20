package pattern

class Order {
    var totalCost: Int  = 0
        set(value) {
            field += value
        }

    private var isClosed: Boolean = false

    fun processOrder(strategy: PayStrategy) {
        strategy.collectPaymentDetails()
    }

    fun isClosed(): Boolean {
        return isClosed
    }

    fun setClosed() {
        isClosed = true
    }
}