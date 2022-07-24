package HackerRank

/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    val map = mutableMapOf<Int, Int>()
    for (i in candles) {
        if (i in map.keys) map[i] = map[i]!! + 1 else map += i to 1
    }
    val key = map.keys.max()
    return map[key]!!
}

fun main(args: Array<String>) {
    /*
    4
    3 2 1 3
     */
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
