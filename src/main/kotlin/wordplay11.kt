import java.io.File
import java.io.IOException
import java.util.*

fun main() {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"
    var numberOfWords: Int = 0

    try {
        val sc = Scanner(File(filename))
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            if (line.contains("TYPE")) {
                numberOfWords++
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
    println(numberOfWords)
}