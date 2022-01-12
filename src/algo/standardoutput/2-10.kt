import java.util.StringTokenizer

private val INPUT = System.`in`

private val bufferedReader = INPUT.bufferedReader()
private fun readLn() = bufferedReader.readLine()!!

private var tokenizer = StringTokenizer("")
private fun read(): String {
    while (tokenizer.hasMoreTokens().not()) tokenizer = StringTokenizer(readLn(), " ")
    return tokenizer.nextToken()
}

private fun readInt() = read().toInt()

fun main() {
    val S = read()
    val N = readInt()
    val M = readInt()
    val n = S[N-1]
    val m = S[M-1]
    val list = S.toMutableList() // toList()にはしない
    list[N-1] = m // immutableだと値の更新ができない
    list[M-1] = n
    println(list.joinToString(separator=""))
}