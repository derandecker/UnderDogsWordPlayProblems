import java.io.File
import java.io.IOException
import java.util.*

fun main() {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"
    var words = mutableListOf<String>()

    try {
        val sc = Scanner(File(filename))
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            if (line.endsWith("GHTLY")) {
                words.add(line)
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
    print(words)
}