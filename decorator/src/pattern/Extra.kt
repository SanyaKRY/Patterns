package pattern

abstract class Extra constructor(label: String, price: Double, order: Order) : Order {

    protected var label: String = label
    protected var price: Double = price
    protected var order: Order = order

    override abstract fun getPriceOrder(): Double

    override fun getLabelOrder(): String {
        return order.getLabelOrder() + ", " + label
    }
}