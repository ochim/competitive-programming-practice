package AtCoder.typical.ninety

/*
004.Cross Sum
 */
fun main() {
    val (H, W) = readLine()!!.split(" ").map { it.toInt() }
    val A = Array(H) { intArrayOf() }
    val row = Array(H) { 0 }
    val column = Array(W) { 0 }

    for (i in 0 until H) {
        A[i] = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    }

    for (i in 0 until H) {
        for (ci in 0 until W) {
            row[i] += A[i][ci]
            column[ci] += A[i][ci]
        }
    }

    for (i in 0 until H) {
        for (ci in 0 until W) {
            val ans = row[i] + column[ci] - A[i][ci]
            print("$ans ")
        }
        println()
    }
}
