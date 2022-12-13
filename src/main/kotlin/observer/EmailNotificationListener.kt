package singleton.observer

import java.io.File

class EmailNotificationListener constructor(private var email: String) : EventListener {

    override fun update(eventType: String, file: File) {
        println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName())
    }
}