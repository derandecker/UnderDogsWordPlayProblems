import java.io.File
import java.io.IOException
import java.util.*

//may also have the same issue as wordplay13 where multiple answers
//should be returned
fun containsNoVowels(line: String): Boolean {
    return (!line.contains('A') &&
            !line.contains('E') &&
            !line.contains('I') &&
            !line.contains('O') &&
            !line.contains('U'))
}

fun main() {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"
    var words = mutableListOf<String>()

    try {
        val sc = Scanner(File(filename))
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            if (containsNoVowels(line)) {
                words.add(line)
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
    val longest = words.maxByOrNull { it.length }
    println(longest)
}