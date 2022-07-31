package HackerRank

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here
    val hour = s.substring(0, 2)
    var h = 0

    val min = s.substring(3, 5)
    val sec = s.substring(6, 8)
    val format = s.substring(8, 10)

    if (format == "PM") {
        h = hour.toInt() + 12
        if (h >= 24) h -= 12

    } else {
        h = hour.toInt()
        if (h >= 12) h -= 12

    }
    return "$h".padStart(2, '0') + ":$min:$sec"
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
