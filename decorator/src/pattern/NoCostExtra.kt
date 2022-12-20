package pattern

class NoCostExtra constructor(label: String, price: Double, order: Order) : Extra(label, price, order) {

    override fun getPriceOrder(): Double {
        return order.getPriceOrder()
    }
}