package HackerRank

/*
 * Complete the 'arrayManipulation' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. 2D_INTEGER_ARRAY queries
 */

fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {
    // Write your code here
    val numbers = Array<Long>(n+1) {0}
    for (query in queries) {
        val a = query[0]
        val b = query[1]
        val k = query[2].toLong()
        numbers[a] += k
        if (b + 1 <= n) numbers[b+1] -= k
    }
    var temp = 0L
    var max = 0L
    for (i in 1..n) {
        temp += numbers[i]
        if (temp > max) max = temp
    }
    return max
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val queries = Array<Array<Int>>(m, { Array<Int>(3, { 0 }) })

    for (i in 0 until m) {
        queries[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = arrayManipulation(n, queries)

    println(result)
}
