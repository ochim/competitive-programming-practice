package AtCoder

/*
B
*/
fun main() {
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val roads = Array<MutableList<Int>>(N+1) { mutableListOf() }

    for(i in 1..M) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        roads[a].add(b)
        roads[b].add(a)
    }

    for (i in 1..N) {
        val road = roads[i]
        road.sort()
        println("${road.size} " + road.joinToString(" "))
    }
}
