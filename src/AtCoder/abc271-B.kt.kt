package AtCoder

/*
ABC271 B
 */
fun main() {
    val (N, Q) = readLine()!!.split(" ").map { it.toInt() }
    val list = MutableList(N) { mutableListOf<Int>() }
    for (i in 0 until N) {
        val A = readLine()!!.split(" ").map { it.toInt() }
        for (j in A.indices) {
            if (j == 0) continue
            list[i].add(A[j])
        }
    }
    repeat (Q) {
        val (s, t) = readLine()!!.split(" ").map { it.toInt() }
        println(list[s-1][t-1])
    }
}
