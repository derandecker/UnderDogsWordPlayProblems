import java.io.File
import java.io.IOException
import java.util.*

//answer should contain multiple values
//currently only returns the first shortest word
//but multiple words exist with same length
fun containsEveryVowel(line: String): Boolean {
    return (line.contains('A') &&
            line.contains('E') &&
            line.contains('I') &&
            line.contains('O') &&
            line.contains('U'))
}

fun main() {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"
    var words = mutableListOf<String>()

    try {
        val sc = Scanner(File(filename))
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            if (containsEveryVowel(line)) {
                words.add(line)
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
    val shortest = words.minByOrNull { it.length }
    println(shortest)
}