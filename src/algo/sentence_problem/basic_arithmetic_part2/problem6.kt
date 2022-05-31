package algo.sentence_problem.basic_arithmetic_part2

private fun readList() = readLine()!!.split(" ")
private fun readIntList() = readList().map { it.toInt() }

/* 問題６
時刻 U にバスが駅にやってきて、それ以降時間が T だけ経過するたびにバスが駅にやってきます。
つまりバスは時刻 U,U+T,U+2T,… にやってきます。太郎君は時刻 A に駅に着きました。
太郎君は駅に到着してから最初に来たバスに乗ろうとしています。どの時刻にバスに乗りますか。
*/
fun main() {
    val (U, T, A) = readIntList()
    println(U + (A - U + T - 1) / T * T)
}

fun main1() {
    val (U, T, A) = readIntList()
    var i = 0
    while((U + T * i) < A) {
        i += 1
    }
    println(U + T * i)
}
