package algo.sentence_problem.basic_arithmetic_part2

private fun readList() = readLine()!!.split(" ")
private fun readIntList() = readList().map { it.toInt() }

/* 問題３
L m のひもから、1 本の長さが A m のひもを切り取っていきます。何本のひもを切り取ることができますか。ただし、あまったひもは捨てるものとします。
 */
fun main() {
    val (L, A) = readIntList()
    println(L / A)
}