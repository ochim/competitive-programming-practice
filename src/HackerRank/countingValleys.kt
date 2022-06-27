package HackerRank

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */
fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var nowlevel = 0
    var count = 0
    for (c in path) {
        when (c) {
            'U' -> nowlevel++
            'D' -> nowlevel--
        }
        if (nowlevel == 0 && c == 'U') count++
    }
    return count
}

fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}
