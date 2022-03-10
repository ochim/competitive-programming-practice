package algo.dp

import kotlin.math.min

private fun readIntList() = readLine()!!.split(" ").map { it.toInt() }
/*
Q1-5.マスの移動（２）
 */
fun main() {
    val l = readIntList()
    val N = l[0]
    val M = l[1]
    val A = readIntList()

    val T = MutableList(N) { Int.MAX_VALUE }
    T[0] = 0

    for (i in 1 until N) {
        for (j in 1 until M+1) {
            if (i - j >= 0) T[i] = min(T[i], T[i-j] + j * A[i])
        }
    }

    println(T[N-1])
}