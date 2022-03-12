package algo.dp

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
Q1-6.すごろく
 */
fun main() {
    val N = readInt()
    val M = readInt()
    val D = readIntList()

    val dp = MutableList(N + 1) { false }
    dp[0] = true

    for (i in 1 until N + 1) {
        for (j in 0 until M) {
            if (i - D[j] >= 0 && dp[i - D[j]]) dp[i] = true
        }
    }

    println(if (dp[N]) "Yes" else "No")
}