import java.io.File
import java.io.IOException
import java.util.*

fun isPalindrome(line: String): Boolean {
    return (line == line.reversed())
}

fun main() {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"
    var words = mutableListOf<String>()

    try {
        val sc = Scanner(File(filename))
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            if (isPalindrome(line)) {
                words.add(line)
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
    val longest = words.maxByOrNull { it.length }
    println(longest)
}