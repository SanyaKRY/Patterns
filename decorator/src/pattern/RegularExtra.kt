package pattern

class RegularExtra constructor(label: String, price: Double, order: Order) : Extra(label, price, order) {

    override fun getPriceOrder(): Double {
        return this.price + order.getPriceOrder()
    }

}