package AtCoder.ABS

fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    var count = 0
    while (true) {
        var b = false
        for (i in A.indices) {
            if (A[i] % 2 == 1) {
                b = true
                break
            } else {
                A[i] = A[i] / 2
            }
        }

        if (b) break else count++
    }
    println(count)
}
