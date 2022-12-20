import pattern.Editor
import pattern.EmailNotificationListener
import pattern.LogOpenListener

fun main() {
    var editor: Editor = Editor()
    editor.events.subscribe("open", LogOpenListener("file.txt"))
    editor.events.subscribe("save", EmailNotificationListener("admin@example.com"))
    editor.openFile("test.txt")
    editor.saveFile()
}