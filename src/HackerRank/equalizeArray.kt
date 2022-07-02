package HackerRank

import kotlin.collections.*

/*
 * Complete the 'equalizeArray' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun equalizeArray(arr: Array<Int>): Int {
    val map = mutableMapOf<Int, Int>()
    for (a in arr) {
        if (a in map.keys) {
            map[a] = map[a]!! + 1
        } else {
            map += a to 1
        }
    }
    val maxEntry = map.maxBy { it.value }
    return arr.size - maxEntry!!.value
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = equalizeArray(arr)
    //val result = equalizeArray([3, 3, 2, 1, 3])

    println(result)
}
