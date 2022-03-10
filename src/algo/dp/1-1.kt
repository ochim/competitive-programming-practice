package algo.dp

/*
Q1-1
 */
fun main() {
    val A = readLine()!!.split(" ").map{ it.toInt() }
    val N = A[0]
    val X = A[1]
    val Y = A[2]

    val l = mutableListOf(X, Y)
    for (i in 2 until N) {
        l.add((l[i-2] + l[i-1]) % 100)
    }

    println(l[N-1])
}