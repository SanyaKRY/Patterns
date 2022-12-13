package singleton.observer

import java.io.File

class EventManager {

    var listeners:HashMap<String, MutableList<EventListener>> = HashMap<String, MutableList<EventListener>>()

    constructor(vararg operations: String) {
        for (operation in operations) {
            this.listeners.put(operation, mutableListOf())
        }
    }

    fun subscribe(eventType: String, listener: EventListener) {
        var users: MutableList<EventListener>? = listeners.get(eventType)
        users?.add(listener)
    }

    fun unsubscribe(eventType: String, listener: EventListener) {
        var users: MutableList<EventListener>? = listeners.get(eventType)
        users?.remove(listener)
    }

    fun notify(eventType: String, file: File) {
        var users: MutableList<EventListener>? = listeners.get(eventType)
        users?.forEach {
            it.update(eventType, file)
        }
    }
}