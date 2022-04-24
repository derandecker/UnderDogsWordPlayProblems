import java.io.File
import java.io.IOException
import java.util.*

fun doMatchSix(line: String) {
    if (line.contains("B") && line.contains("X") && line.length < 5) {
        println(line)
    }
}

fun main() {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"

    try {
        val sc = Scanner(File(filename))
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            doMatchSix(line)
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}