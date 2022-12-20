package pattern

import java.io.File

class LogOpenListener : EventListener {

    private var log: File

    constructor(fileName: String) {
        log = File(fileName)
    }

    override fun update(eventType: String, file: File) {
        println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName())
    }
}