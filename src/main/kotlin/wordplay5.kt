import java.io.File
import java.io.IOException
import java.util.*

fun doMatchFive(line: String) {
    if (!line.contains("E") && !line.contains("A") && line.length >= 15) {
        println(line)
    }
}

fun main() {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"

    try {
        val sc = Scanner(File(filename))
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            doMatchFive(line)
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}