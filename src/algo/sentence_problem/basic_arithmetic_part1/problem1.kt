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

/* 問題１
りんごが A 個あります。新しく B 個のりんごを買ってきました。りんごは合わせて何個になりましたか。
 */
fun main() {
    val A = readToInt()
    val B = readToInt()
    println(A + B)
}
