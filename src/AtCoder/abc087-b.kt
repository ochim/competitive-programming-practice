/*
 * abc 087 B
 * Coins
 */
import java.util.StringTokenizer

private val INPUT = System.`in`

private val bufferedReader = INPUT.bufferedReader()

private fun readLn() = bufferedReader.readLine()!!
private var tokenizer = StringTokenizer("")
private fun read(): String {
    while (tokenizer.hasMoreTokens().not()) tokenizer = StringTokenizer(readLn(), " ")
    return tokenizer.nextToken()
}

private fun readInt() = read().toInt()

fun main(args: Array<String>) {
    val a = readInt()
    val b = readInt()
    val c = readInt()
    val x = readInt()

    var res = 0
    for (i in 0..a) {
        for (j in 0..b) {
            for (k in 0..c) {
                val total = 500*i + 100*j + 50*k
                if (total == x) {
                    res++
                }
            }
        }
    }

    println(res)
}
