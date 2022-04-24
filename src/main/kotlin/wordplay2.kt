import java.io.File
import java.io.IOException
import java.util.*

fun doMatchTwo(line: String) {
    if (line.contains("X") && line.contains("Y") && line.contains("Z")) {
        println(line)
    }
}

fun main() {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"

    try {
        val sc = Scanner(File(filename))
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            doMatchTwo(line)
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}