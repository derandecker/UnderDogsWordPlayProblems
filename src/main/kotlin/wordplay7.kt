@file:JvmName("Wordplay7Kt")

import java.io.File
import java.io.IOException
import java.util.*

fun doMatchSeven(line: String) {
    val first = line[0]
    val lastIndex = line.length - 1
    val last = line[lastIndex]
    if (first == 'Y' && last == 'Y') {
        println(line)
    }
}

fun main() {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"

    try {
        val sc = Scanner(File(filename))
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            doMatchSeven(line)
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}