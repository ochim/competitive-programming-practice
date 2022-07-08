package algo.graph

/*
Q3.人気者の友達
 */
fun main() {
/*
6 7
0 1
0 5
1 3
1 5
2 3
3 4
4 5
*/
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val graph = List(N) { mutableListOf<Int>() }
    (0 until M).map {
        val (A, B) = readLine()!!.split(" ").map { it.toInt() }
        graph[A].add(B)
        graph[B].add(A)
    }

    var maxNum = -1
    var index = -1
    for (i in 0 until N) {
        if (maxNum < graph[i].size) {
            maxNum = graph[i].size
            index = i
        }
    }
    println(graph[index].sorted().joinToString(separator = " "))
}
