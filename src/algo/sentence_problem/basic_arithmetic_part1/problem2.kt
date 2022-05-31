package algo.sentence_problem.basic_arithmetic_part1

import java.util.StringTokenizer

private val INPUT = System.`in`
private val bufferedReader = INPUT.bufferedReader()

private fun readLn() = bufferedReader.readLine()!!
private var tokenizer = StringTokenizer("")
private fun read(): String {
    while (tokenizer.hasMoreTokens().not()) tokenizer = StringTokenizer(readLn(), " ")
    return tokenizer.nextToken()
}
private fun readToInt() = read().toInt()

/* 問題２
りんごが A 個あります。そのうちの B 個のりんごを食べました。残りのりんごは何個になりましたか。
 */
fun main() {
    val A = readToInt()
    val B = readToInt()
    println(A - B)
}
