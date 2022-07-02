package HackerRank

/*
 * Complete the 'acmTeam' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts STRING_ARRAY topic as parameter.
 */

fun acmTeam(topic: Array<String>): Array<Int> {
    fun topicsKnown(a: String, b: String): Int {
        val l = a.length
        val ns = buildString {
            for (i in 0 until l) {
//                if ((a[i] - '0').or((b[i]- '0')) == 1) append('1') else append('0')
                // ビット演算
                if (a[i].digitToInt().or(b[i].digitToInt()) == 1) append('1') else append('0')
            }
        }
//        println(ns)
        return ns.count { it == '1' }
    }

    val size = topic.size
    val map = mutableMapOf<Int, Int>()
    for (i in 0 until size) {
        for (j in i until size) {
            val n = topicsKnown(topic[i], topic[j])
            if (n in map.keys) map[n] = map[n]!! + 1 else map += n to 1
        }
    }
    val max = map.keys.max()
    return arrayOf(max!!, map[max]!!)
}


fun main(args: Array<String>) {
/*
4 5
10101
11100
11010
00101
*/
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val topic = Array<String>(n, { "" })
    for (i in 0 until n) {
        val topicItem = readLine()!!
        topic[i] = topicItem
    }

    val result = acmTeam(topic)
    println(result.joinToString("\n"))
}
