package HackerRank

/*
 * Complete the 'maxMin' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY arr
 */

fun maxMin(k: Int, arr: Array<Int>): Int {
    // Write your code here
    arr.sort()
    val s = arr.size
    val K = k - 1
    var diff = Integer.MAX_VALUE

    for (i in 0 until s-K) {
        // coerceIn, coerceAtLeast, coerceAtMost http://y-anz-m.blogspot.com/2018/02/kotin-coercein.html
        diff = diff.coerceAtMost(arr[i + K] - arr[i])
    }
    return diff
}

fun main(args: Array<String>) {
/*
7
3
10
100
300
200
1000
20
30
*/
    val n = readLine()!!.trim().toInt()

    val k = readLine()!!.trim().toInt()

    val arr = Array<Int>(n, { 0 })
    for (i in 0 until n) {
        val arrItem = readLine()!!.trim().toInt()
        arr[i] = arrItem
    }

    val result = maxMin(k, arr)

    println(result)
}
