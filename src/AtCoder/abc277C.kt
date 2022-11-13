package AtCoder

/*
277C
*/
@kotlin.ExperimentalStdlibApi
fun main() {
    val N = readLine()!!.toInt()
    val graph: MutableMap<Int, MutableList<Int>> = mutableMapOf()
    for (i in 0 until N) {
        val (A, B) = readLine()!!.split(" ").map { it.toInt() }
        if (A in graph.keys) graph[A]!!.add(B) else graph += A to mutableListOf(B)
        if (B in graph.keys) graph[B]!!.add(A) else graph += B to mutableListOf(A)
    }

    val queue = ArrayDeque(listOf(1))
    val s = mutableSetOf(1)

    while (queue.isNotEmpty()) {
        val v = queue.removeFirst()
        if (v in graph.keys) {
            for (i in graph[v]!!) {
                if (i !in s) {
                    queue.add(i)
                    s.add(i)
                }
            }
        }
    }
    println(s.max())
}
