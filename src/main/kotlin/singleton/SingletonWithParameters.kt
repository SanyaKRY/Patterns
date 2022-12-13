package singleton

class SingletonWithParameters private constructor(private var config: Config) {

    fun printConfig() {
        println(config.toString())
    }

    companion object {

        private var instance: SingletonWithParameters? = null

        fun getInstance( config: Config): SingletonWithParameters{
            if (instance == null) {
                instance = SingletonWithParameters(config)
            }
            return instance!!
        }
    }
}

class Config