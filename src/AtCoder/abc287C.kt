package AtCoder

/*
287C
*/
fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val graph = Array(n) { mutableListOf<Int>() }

    for (i in 0 until m) {
        var (u, v) = readLine()!!.split(" ").map { it.toInt() }
        u -= 1
        v -= 1
        graph[u].add(v)
        graph[v].add(u)
    }

    if (m != n-1) {
        println("No")
        return
    }

    for (i in 0 until n) {
        if (graph[i].size > 2) {
            println("No")
            return
        }
    }

    val reach = BooleanArray(n) { false }
    val que = mutableListOf<Int>()
    reach[0] = true
    que.add(0)
    while (que.isNotEmpty()) {
        val u = que[0]
        que.removeAt(0)
        for (v in graph[u]) {
            if (!reach[v]) {
                reach[v] = true
                que.add(v)
            }
        }
    }
    for (i in 0 until n) {
        if (!reach[i]) {
            println("No")
            return
        }
    }

    println("Yes")
}
