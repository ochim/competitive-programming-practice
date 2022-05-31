package algo.sentence_problem.basic_arithmetic_part2

private fun readList() = readLine()!!.split(" ")
private fun readDoubleList() = readList().map { it.toDouble() }

/* 問題４
N 人の小学生がバスに乗って遠足に行きます。1 台のバスには A 人まで乗ることができます。バスは少なくとも何台必要ですか。
 */
fun main() {
    val (N, A) = readDoubleList()
    println(Math.ceil(N / A).toInt())
}