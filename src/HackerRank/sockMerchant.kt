package HackerRank

import kotlin.collections.*

/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here
    val mutableMap = mutableMapOf<Int, Int>()
    for (a in ar) {
        if (a in mutableMap.keys) mutableMap[a] = mutableMap[a]!! + 1 else mutableMap += a to 1
    }

    var value = 0
    for (v in mutableMap.values) {
        value += v / 2
    }
    return value
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
