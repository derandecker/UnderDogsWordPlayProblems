import java.io.File
import java.io.IOException
import java.util.*

fun doMatchEight(line: String) {
    if (!line.contains('A') &&
        !line.contains('E') &&
        !line.contains('I') &&
        !line.contains('O') &&
        !line.contains('U') &&
        !line.contains('Y'))
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
            doMatchEight(line)
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}