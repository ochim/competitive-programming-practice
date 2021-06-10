import java.util.StringTokenizer

private val INPUT = System.`in`

private val bufferedReader = INPUT.bufferedReader()
private fun readLn() = bufferedReader.readLine()!!

private fun readList() = readLn().split(' ')
private var tokenizer = StringTokenizer("")
private fun read(): String {
    while (tokenizer.hasMoreTokens().not()) tokenizer = StringTokenizer(readLn(), " ")
    return tokenizer.nextToken()
}

private fun readInt() = read().toInt()
private fun readIntArray(n: Int = 0) =
    if (n == 0) readList().run { IntArray(size) { get(it).toInt() } } else IntArray(n) { readInt() }

/*
* ABC 088 B - Card Game for Two
 */
fun main(args: Array<String>) {
    val N = readInt()
    val a = readIntArray(N)
    a.sortDescending()

    var alice = 0
    var bob = 0
    for (i in a.indices) {
        if (i % 2 == 0) alice += a[i] else bob += a[i]
    }

    println(alice - bob)
}