import java.io.File
import java.io.IOException
import java.util.*

fun doMatchOne(line: String) {
    if (line.contains("UU")) {
        println(line)
    }
}

fun main() {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"

    try {
        val sc = Scanner(File(filename))
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            doMatchOne(line)
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}