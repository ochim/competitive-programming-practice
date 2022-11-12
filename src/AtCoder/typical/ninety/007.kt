package AtCoder.typical.ninety

/*
007.CP Classes
 */
fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val Q = readLine()!!.toInt()
    val B = IntArray(Q) {0}
    for (i in 0 until Q) {
        B[i] = readLine()!!.toInt()
    }

    // 汎用的な二分探索のテンプレ
    fun binary_search_lower_bound(key: Int): Int {
        var left = -1; // index = 0 が条件を満たすこともあるので、初期値は -1
        var right = A.size; // index = a.size-1 が条件を満たさないこともあるので、初期値は a.size

        // どんな二分探索でもここの書き方を変えずにできる！
        while (right - left > 1) {
            val mid = left + (right - left) / 2

            if (A[mid] >= key) right = mid
            else left = mid
        }
        // left は条件を満たさない最大の値、right は条件を満たす最小の値になっている
        return right
    }

    A.sort()

    for (i in 0 until Q) {
        val pos = binary_search_lower_bound(B[i])
        var diff1 = Int.MAX_VALUE
        var diff2 = Int.MAX_VALUE
        if (pos < N) diff1 = Math.abs(B[i] - A[pos])
        if (pos > 0) diff2 = Math.abs(B[i] - A[pos -1])
        println(Math.min(diff1, diff2))
    }
}
