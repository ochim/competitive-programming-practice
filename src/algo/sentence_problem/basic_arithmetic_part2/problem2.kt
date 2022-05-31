package algo.sentence_problem.basic_arithmetic_part2

private fun readList() = readLine()!!.split(" ")
private fun readIntList() = readList().map { it.toInt() }

/* 問題２
貯金が A 円あります。1 個 B 円のりんごをできるだけ多く買うことにすると、何円あまりますか。
 */
fun main() {
    val (A, B) = readIntList()
    println(A % B)
}