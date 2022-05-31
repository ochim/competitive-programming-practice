package algo.sentence_problem.basic_arithmetic_part1

private fun readList() = readLine()!!.split(" ")
private fun readIntList() = readList().map { it.toInt() }

/* 問題３
1 個 A 円のりんごを B 個買いました。代金は合計で何円ですか。
 */
fun main() {
    val l = readIntList()
    val A = l[0]
    val B = l[1]
    println(A * B)
}
