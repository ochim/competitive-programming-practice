package algo.sentence_problem.basic_arithmetic_part1

private fun readList() = readLine()!!.split(" ")
private fun readIntList() = readList().map { it.toInt() }

/* 問題５
あるお店では、1 個 A 円のりんごと、1 個 B 円のみかんを売っています。りんご C 個とみかん D 個を買いました。
代金は合計で何円ですか。
 */
fun main() {
    val l = readIntList()
    val A = l[0]
    val B = l[1]
    val C = l[2]
    val D = l[3]
    println(A * C + B * D)
}