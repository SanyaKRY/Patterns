import pattern.Config
import pattern.Singleton
import pattern.SingletonWithParameters

fun main() {
    println("Hello kotlin")
    println()
    Singleton.printValue()
    println(Singleton.value)

    println("pattern.SingletonWithParameters")
    println("kotlin singleton class with parameters")
    println("to implement parameters we need a normal class, having a companion object and private default constructors")
    SingletonWithParameters.getInstance(Config()).printConfig()
    SingletonWithParameters.getInstance(Config()).printConfig()
    SingletonWithParameters.getInstance(Config()).printConfig()
}
