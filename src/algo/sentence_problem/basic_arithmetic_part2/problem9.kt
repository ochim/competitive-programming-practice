package algo.sentence_problem.basic_arithmetic_part2

private fun readList() = readLine()!!.split(" ")
private fun readIntList() = readList().map { it.toInt() }

/* 問題９
A 以上 B 以下の整数のうち、K の倍数は何個あるでしょうか。
*/
fun main() {
    val (A, B, K) = readIntList()
    println(B / K - (A - 1) / K)
}
