import java.io.File
import java.io.IOException
import java.util.*

//not quite there but on the right track
fun checkDoubleLetters(line: String): Boolean {
    var c: Char = 'A'
    var doubleLetter: String
    try {
        while (c <= 'Z') {
            doubleLetter = buildString {
                this.append(c)
                this.append(c)
            }
            return line.contains(doubleLetter)
        }
    } catch (e: Error) {
    }
    return false
}

fun main() {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"

    try {
        val sc = Scanner(File(filename))
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            checkDoubleLetters(line)
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}