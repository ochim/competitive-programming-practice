package HackerRank

/*
 * Complete the 'lonelyinteger' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun lonelyinteger(a: Array<Int>): Int {
    // 1 <= n < 100
    // 0<= a[i] <= 100, 0<= i < n
    val array = IntArray(101) {0}
    a.forEach { array[it] = array[it] + 1 }
    var index = 0
    for (i in array) {
        if (i == 1) break else index++
    }
    return index
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = lonelyinteger(a)

    println(result)
}
