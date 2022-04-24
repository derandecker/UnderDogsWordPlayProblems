import java.io.File
import java.io.IOException
import java.util.*

fun countletter(line: String, letter: Char): Int {
    var counter: Int = 0
    line.forEach { it ->
        if (it == letter) {
            counter++
        }
    }
    return counter
}

fun main() {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"
    var letterFrequency = mutableListOf<Int>()
    var counterQ: Int = 0
    var counterX: Int = 0
    var counterZ: Int = 0

    try {
        val sc = Scanner(File(filename))
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            counterQ += countletter(line, 'Q')
            counterX += countletter(line, 'X')
            counterZ += countletter(line, 'Z')
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
    letterFrequency.add(counterQ)
    letterFrequency.add(counterX)
    letterFrequency.add(counterZ)
    var minimum = letterFrequency.minByOrNull { it }
    when (minimum) {
        letterFrequency[0] -> println('Q')
        letterFrequency[1] -> println('X')
        letterFrequency[2] -> println('Z')
    }
}