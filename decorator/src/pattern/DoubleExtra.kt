package pattern

class DoubleExtra constructor(label: String, price: Double, order: Order) : Extra(label, price, order) {

    override fun getPriceOrder(): Double {
        return (this.price * 2) + order.getPriceOrder()
    }

    override fun getLabelOrder(): String {
        return order.getLabelOrder() + ", Double" + this.label
    }
}