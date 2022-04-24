import java.io.File
import java.io.IOException
import java.util.*

fun doMatchNine(line: String) {
    if (line.contains('A') &&
        line.contains('E') &&
        line.contains('I') &&
        line.contains('O') &&
        line.contains('U'))
    {
        println(line)
    }
}

fun main() {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"

    try {
        val sc = Scanner(File(filename))
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            doMatchNine(line)
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}