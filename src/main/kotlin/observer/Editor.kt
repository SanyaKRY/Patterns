package singleton.observer

import java.io.File

class Editor {
    var events: EventManager
    private var file: File? = null

    constructor() {
        this.events = EventManager("open", "save")
    }

    fun openFile(filePath: String) {
        this.file = File(filePath)
        events.notify("open", file!!)
    }

    fun saveFile() {
        if (this.file != null) {
            events.notify("save", file!!)
        } else {
            throw Exception("Please open a file first.")
        }
    }
}