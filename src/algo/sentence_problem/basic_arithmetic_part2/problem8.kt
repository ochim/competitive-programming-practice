package algo.sentence_problem.basic_arithmetic_part2

private fun readList() = readLine()!!.split(" ")
private fun readIntList() = readList().map { it.toInt() }

/* 問題８
1 以上 N 以下の整数のうち、K の倍数は何個あるでしょうか。
*/
fun main() {
    val (N, K) = readIntList()
    println(N / K)
}
