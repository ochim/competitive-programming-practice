package AtCoder

/*
277A
*/
fun main() {
    val (N, X) = readLine()!!.split(" ").map { it.toInt() }
    val P = readLine()!!.split(" ").map { it.toInt() }

    var index = -1
    for (i in 0 until N) {
        if (P[i] == X) {
            index = i + 1
            break
        }
    }
    println(index)
}
