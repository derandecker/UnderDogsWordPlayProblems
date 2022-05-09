import java.io.File
import java.io.IOException
import java.util.*


// Not quite there yet, still tryings
fun vowelsInOrder(line: String): Boolean {

    if (!(line.contains('A') &&
        line.contains('E') &&
        line.contains('I') &&
        line.contains('O') &&
        line.contains('U'))
    ) {
        return false
    }

    var indexA: Int = -1
    var indexE: Int = -1
    var indexI: Int = -1
    var indexO: Int = -1
    var indexU: Int = -1

    var noMoreA = false
    var noMoreE = false
    var noMoreI = false
    var noMoreO = false
    var noMoreU = false

    val charArr = line.split("")
    charArr.forEachIndexed { index, it ->
        if (it == "A" && !noMoreA) {
            indexA = index
            noMoreA = true
        }
        if (it == "E" && !noMoreE) {
            indexE = index
            noMoreE = true
        }
        if (it == "I" && !noMoreI) {
            indexI = index
            noMoreI = true
        }
        if (it == "O" && !noMoreO) {
            indexO = index
            noMoreO = true
        }
        if (it == "U" && !noMoreU) {
            indexU = index
            noMoreU = true
        }
    }

    println(line)
    println("$indexA, $indexE, $indexI, $indexO, $indexU")

    val listOfIndices = mutableListOf<Int>()
    listOfIndices.add(indexA)
    listOfIndices.add(indexE)
    listOfIndices.add(indexI)
    listOfIndices.add(indexO)
    listOfIndices.add(indexU)
    val sortedIndices = listOfIndices.toSortedSet()

    if (indexA + indexE + indexI + indexO + indexU > 0) {
        return (sortedIndices == listOfIndices)
    } else return false
}

fun main() {
    val filename = "/Users/deran/IdeaProjects/Wordplay1/src/main/resources/sowpods.txt"
    var solutions = mutableListOf<String>()

    try {
        val sc = Scanner(File(filename))
        while (sc.hasNextLine()) {
            val line = sc.nextLine()
            if (vowelsInOrder(line)) {
                solutions.add(line)
            }
        }

        println(solutions)

    } catch (e: IOException) {
        e.printStackTrace()
    }
}