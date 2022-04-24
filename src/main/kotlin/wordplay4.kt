import java.io.File
import java.io.IOException
import java.util.*

fun doMatchFour(line: String) {
    if (line.contains("CAT") && line.length == 5) {
        println(line)
    }
}

fun main() {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"

    try {
        val sc = Scanner(File(filename))
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            doMatchFour(line)
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}