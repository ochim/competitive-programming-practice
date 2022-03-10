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
 * 配列の全探索8
 */
fun main() {
    val N = readInt()
    val list = readIntList()
    check(list.isNotEmpty())

    var min = list.first()
    for (i in 0 until N) {
        if (min > list[i]) {
            min = list[i]
        }
    }
    println(min)
}