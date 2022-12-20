package pattern

import java.io.File

interface EventListener {
    fun update(eventType: String, file: File)
}