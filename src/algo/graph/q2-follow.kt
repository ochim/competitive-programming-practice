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
    val graph = List(N) { MutableList<Int>(N) {0} }
    (0 until M).map {
        val (A, B) = readLine()!!.split(" ").map { it.toInt() }
        graph[A][B] = 1
    }
    for (i in 0 until N) {
        for (j in 0 until N) {
            if (graph[i][j] == 1) print("$j ")
        }
        println()
    }
}
