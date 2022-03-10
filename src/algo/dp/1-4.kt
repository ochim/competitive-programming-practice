package algo.dp

/*
Q1-4.タイルの敷き詰め
 */
fun main() {
    val N = readLine()!!.toInt()

    val t = MutableList(N+1){ 0 }
    t[0] = 1

    for (i in 1 until N+1) {
        if (i-1 >= 0) t[i] += t[i-1]
        if (i-2 >= 0) t[i] += t[i-2]
        if (i-3 >= 0) t[i] += t[i-3]
    }
    println(t[N])
}