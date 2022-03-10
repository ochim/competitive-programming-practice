package algo.dp

import kotlin.math.min

/*
Q1-2
 */
fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map{ it.toInt() }

    val T = mutableListOf(0, A[1])
    for (i in 2 until N) {
        val t = min(T[i-1] + A[i], T[i-2] + A[i] * 2)
        T.add(t)
    }

    println(T[N-1])
}