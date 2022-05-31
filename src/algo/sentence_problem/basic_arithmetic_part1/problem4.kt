package algo.sentence_problem.basic_arithmetic_part1

private fun readList() = readLine()!!.split(" ")
private fun readIntList() = readList().map { it.toInt() }

/* 問題４
1 個 A 円のりんごを何個か買ったところ、代金は合計で B 円でした。りんごを何個買いましたか。
 */
fun main() {
    val l = readIntList()
    val A = l[0]
    val B = l[1]
    println(B / A)
}