package singleton.decorator

interface Order {
    fun getPriceOrder(): Double
    fun getLabelOrder(): String
}

class Pizza constructor(label: String, price: Double) : Order {

    private var label: String = label
    private var price: Double = price

    override fun getPriceOrder(): Double {
        return price
    }

    override fun getLabelOrder(): String {
        return label
    }
}

abstract class Extra constructor(label: String, price: Double, order: Order) : Order {

    protected var label: String = label
    protected var price: Double = price
    protected var order: Order = order

    override abstract fun getPriceOrder(): Double

    override fun getLabelOrder(): String {
        return order.getLabelOrder() + ", " + label
    }
}

class RegularExtra constructor(label: String, price: Double, order: Order) : Extra(label, price, order) {

    override fun getPriceOrder(): Double {
        return this.price + order.getPriceOrder()
    }

}

class NoCostExtra constructor(label: String, price: Double, order: Order) : Extra(label, price, order) {

    override fun getPriceOrder(): Double {
        return order.getPriceOrder()
    }
}

class DoubleExtra constructor(label: String, price: Double, order: Order) : Extra(label, price, order) {

    override fun getPriceOrder(): Double {
        return (this.price * 2) + order.getPriceOrder()
    }

    override fun getLabelOrder(): String {
        return order.getLabelOrder() + ", Double" + this.label
    }
}