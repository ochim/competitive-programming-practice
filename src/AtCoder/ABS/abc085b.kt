package AtCoder.ABS

/*
ABC085B - Kagami Mochi
 */
fun main() {
    val N = readLine()!!.toInt()
    val d = IntArray(N) {0}
    for (i in d.indices) {
        d[i] = readLine()!!.toInt()
    }

    println(d.toSet().size)
}
