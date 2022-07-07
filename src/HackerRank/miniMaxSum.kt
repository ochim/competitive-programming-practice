package HackerRank

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 * arr: an array of  integers
 * 1 <= arr[i] <= 10.pow(9), arr.size==5
 * Kotlin 1.3.11
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    // 総和がInt(32bit)を超える場合を考慮し、Longに変換してから総和を取る
    val total = arr.map { it.toLong() }.sum()
    println("${total - arr.max()!!} ${total - arr.min()!!}")
}

fun main(args: Array<String>) {
    //256741038 623958417 467905213 714532089 938071625
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
