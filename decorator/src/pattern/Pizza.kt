package pattern

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