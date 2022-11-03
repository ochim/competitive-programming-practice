package AtCoder.ABS

fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    A.sortDescending() // 整数の降順

    var alice = 0
    var bob = 0
    for (i in A.indices) {
        if (i % 2 == 0) alice += A[i] else bob += A[i]
    }
    println(alice - bob)
}
