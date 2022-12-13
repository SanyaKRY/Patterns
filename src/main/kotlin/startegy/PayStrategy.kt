package singleton.startegy

interface PayStrategy {
    fun pay(paymentAmount: Int): Boolean
    fun collectPaymentDetails()
}