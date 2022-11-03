package AtCoder.ABS

import kotlin.math.abs
/*
ABC086C - Traveling
 */
fun main() {
    data class Plan(val t: Int, val x: Int, val y: Int)

    val N = readLine()!!.toInt()
    val plans = Array(N+1) {
        if (it == 0) {
            Plan(0, 0, 0)
        } else {
            val (t, x, y) = readLine()!!.split(" ").map { it.toInt() }
            Plan(t, x, y)
        }
    }

    var can = true
    for (i in 0 until N) {
        val dt = plans[i+1].t - plans[i].t
        val dist = abs(plans[i+1].x - plans[i].x) + abs(plans[i+1].y - plans[i].y)
        if (dt < dist) can = false
        if (dist % 2 != dt % 2) can = false
        if (!can) break
    }

    if (can) println("Yes") else println("No")
}
