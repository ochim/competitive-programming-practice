package AtCoder.ABS

fun main() {
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()
    val C = readLine()!!.toInt()
    val X = readLine()!!.toInt()

    fun binarySearch(n: Int) : Boolean {
        var left = 0
        var right = C
        while (right >= left) {
            val mid = left + (right - left) / 2
            if (mid * 50 == n) return true
            else if (mid * 50 > n) right = mid -1
            else if (mid * 50 < n) left  = mid + 1
        }
        return false
    }

    var count = 0
    for (ai in 0..A)
        for (bi in 0.. B)
            if (binarySearch(X -500 * ai -100 * bi)) count++

    println(count)
}
