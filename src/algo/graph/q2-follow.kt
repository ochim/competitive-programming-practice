package algo.graph

/*
Q2.フォロー
 */
fun main() {
/*
4 4
0 3
0 2
1 2
3 1
*/
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val graph = Array(N) { mutableListOf<Int>() }
    (0 until M).map {
        val (A, B) = readLine()!!.split(" ").map { it.toInt() }
        graph[A].add(B)
    }
    for (i in 0 until N) {
        val sort = graph[i].toIntArray().sorted()
        for (j in sort) {
            print("$j ")
        }
        println()
    }
}
