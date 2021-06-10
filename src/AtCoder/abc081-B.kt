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

/*
abc 081 B
 */
fun main(args: Array<String>) {
    val n = readInt()
    val ints = IntArray(n)
    for (i in 0..n-1) {
        ints[i] = readInt()
    }
    var count = 0
    var existOdd = false

    while (true) {
        for (i in ints) {
            if (i % 2 != 0) existOdd = true
        }

        if (existOdd) break

        for ((j, i) in ints.withIndex()) {
            ints[j] = i / 2
        }
        count++
    }
    println(count)
}