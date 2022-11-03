package AtCoder.ABS

fun main() {
    val (N, A, B) = readLine()!!.split(" ").map { it.toInt() }

    var total = 0
    for (ni in 1..N) {
        var sum = ni % 10
        var tmp = ni / 10
        while (tmp > 0) {
            sum += tmp % 10
            tmp = tmp / 10
        }
        if (sum in A..B) total += ni
    }
    println(total)
}
