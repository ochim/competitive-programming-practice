package algo.sentence_problem.basic_arithmetic_part2

private fun readList() = readLine()!!.split(" ")
private fun readIntList() = readList().map { it.toInt() }

/* 問題５
HP (体力) が M ポイントであるようなモンスターがいます。
モンスターに 1 回攻撃を行うたびに、モンスターの HP を K ずつ減らすことができます。モンスターの HP が K 以下の状態で攻撃をするとモンスターを倒すことができます。
何回の攻撃でモンスターを倒すことができるでしょうか。
 */
fun main() {
    val (M, K) = readIntList()
    println((M + K - 1) / K)
//    if (M % K == 0) println(M / K) else println(M / K + 1)
}
