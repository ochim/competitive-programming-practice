package algo.sentence_problem.basic_arithmetic_part2

private fun readList() = readLine()!!.split(" ")
private fun readIntList() = readList().map { it.toInt() }

/* 問題７
正の整数 A,K が与えられます。A 以上の整数のうち、最小の K の倍数を求めてください。
*/
fun main() {
    val (A, K) = readIntList()
    println((A + K - 1) / K * K)
//    if (A % K == 0)  println(A / K * K) else println((A / K + 1) * K)
}
