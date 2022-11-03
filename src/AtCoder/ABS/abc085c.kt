package AtCoder.ABS

/*

 */
fun main() {
    val (N, Y) = readLine()!!.split(" ").map { it.toInt() }
    var res10000 = -1 // 10000札の枚数
    var res5000 = -1 // 5000札の枚数
    var res1000 = -1 // 1000札の枚数

    var b = false
    for (x in 0..N) {
        for (y in 0..N - x) {
            val z = N - x - y
            if (10000 * x + 5000 * y + 1000 * z == Y) {
                res10000 = x
                res5000 = y
                res1000 = z
                b = true
                break
            }
        }
        if (b) break
    }

    println("$res10000 $res5000 $res1000")
}
