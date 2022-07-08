package algo.graph

/*
Q4.友達の友達
 */
fun main() {
/*
6 7 0
0 1
0 5
1 3
1 5
2 3
3 4
4 5
*/
    val (N, M, X) = readLine()!!.split(" ").map { it.toInt() }
    val graph = List(N) { mutableListOf<Int>() }
    (0 until M).map {
        val (A, B) = readLine()!!.split(" ").map { it.toInt() }
        graph[A].add(B)
        graph[B].add(A)
    }

    val friends = graph[X].toSet()
    val result = mutableSetOf<Int>()
    for (i in graph[X]) {
        for (j in graph[i]) {
            if (j != X && j !in friends) result.add(j)
        }
    }
    println(result.size)
}
