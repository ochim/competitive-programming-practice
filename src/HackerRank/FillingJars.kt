package HackerRank

/*
 * Complete the 'solve' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. 2D_INTEGER_ARRAY operations
 */

fun solve(n: Int, operations: Array<Array<Int>>): Long {
    // Write your code here
    val jars = LongArray(n) { 0 }
    for (operation in operations) {
        val a = operation[0]
        val b = operation[1]
        val k = operation[2]
        for (i in a..b) {
            jars[i - 1] += k.toLong()
        }
    }
//    println(jars.joinToString(separator = ","))
    return jars.sum() / n.toLong()
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val operations = Array<Array<Int>>(m, { Array<Int>(3, { 0 }) })

    for (i in 0 until m) {
        operations[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = solve(n, operations)

    println(result)
}
