import java.io.File
import java.io.IOException
import java.util.*

fun checkAllLines(doubleLetter: String): Boolean {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"
    val sc = Scanner(File(filename))
    while (sc.hasNextLine()) {
        val line = sc.nextLine()
        if (line.contains(doubleLetter)) {
            return false
        }
    }
    return true
}

fun main() {

    try {
        val solutions = mutableListOf<Char>()

        var c: Char = 'A'
        var doubleLetter: String
        while (c <= 'Z') {
            doubleLetter = buildString {
                this.append(c)
                this.append(c)
            }
            if (checkAllLines(doubleLetter)) {
                solutions.add(c)
            }
            ++c
        }

        println(solutions)

    } catch (e: IOException) {
        e.printStackTrace()
    }
}