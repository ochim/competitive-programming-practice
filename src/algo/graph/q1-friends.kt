package algo.graph

/*
Q1.友達
 */
fun main() {
/*
4 1 2
xxox
xxoo
ooxx
xoxx
*/
    val (N, A, B) = readLine()!!.split(" ").map { it.toInt() }
    val graph = buildList<String> {
        (0 until N).map {
            this.add(readLine()!!)
        }
    }

    println(if (graph[A][B] == 'o') "Yes" else "No")
}