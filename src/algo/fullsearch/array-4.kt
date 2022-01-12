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
 * 配列の全探索4
 */
fun main() {
    val N = readInt()
    val V = readInt()
    val list = readIntList()

    var index = -1
    for (i in list.indices) {
        if (list[i] == V) index = i
    }
    println(index)
}