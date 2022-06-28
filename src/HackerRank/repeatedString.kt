package HackerRank

/*
 * Complete the 'repeatedString' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. LONG_INTEGER n
 */

fun repeatedString(s: String, n: Long): Long {
    // Write your code here
    val l = s.length
    val i = s.count { it == 'a' }
    var t = (n / l) * i

    val remainder = (n % l).toInt()
    for (k in 1..remainder) {
        if (s[k-1] == 'a') t++
    }
    return t
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val n = readLine()!!.trim().toLong()

    val result = repeatedString(s, n)
    //val result = repeatedString("aba", 10)

    println(result)
}
