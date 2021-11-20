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
 * ABC 228 B
 */
fun main(args: Array<String>) {
    val N = readInt()
    val X = readInt()
    val A = readIntArray(N)
//    println(A.toList())

    val known = BooleanArray(N+1) { false }
    var i = X
    do {
        known[i] = true
        i = A[i-1]
    } while (!known[i])

    val t = known.filter { it }
    println(t.size)
}