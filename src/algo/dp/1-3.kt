package algo.dp

fun main() {
    val N = readLine()!!.toInt()

    // 0段目は1通り、1段目は1通り
    val T = mutableListOf(1, 1)

    for (i in 2 until N+1) {
        val t = T[i-1] + T[i-2]
        T.add(t)
    }

    println(T[N])
}