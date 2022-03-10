import java.util.StringTokenizer

private val INPUT = System.`in`

private val bufferedReader = INPUT.bufferedReader()
private fun readLn() = bufferedReader.readLine()!!

private fun readList() = readLn().split(' ')
private var tokenizer = StringTokenizer("")
private fun read(): String {
    while (tokenizer.hasMoreTokens().not()) tokenizer = StringTokenizer(readLn(), " ")
    return tokenizer.nextToken()
}

private fun readInt() = read().toInt()

private fun readIntList() = readList().map { it.toInt() }

/*
 * 配列の全探索10
 */
fun main() {
    val N = readInt()
    val list = readIntList()

    val count = MutableList(9) { 0 }
    for (v in list) {
        count[v-1]++
    }

    var index = 0
    for (i in 0 until 9) {
        if (count[index] < count[i]) {
            index = i
        }
    }

    println(index + 1)
}