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
* Time Complexity: PermMissingElem
*/
fun solution2(A: IntArray): Int {
    val size = A.size
    var r = 0
    for (i in size+1 downTo 1 step 1) {
        if (!A.contains(i)) {
            r = i
            break
        }
    }
    return r
}

fun main(args: Array<String>) {
    repeat(1) {
        val N = readInt()
        val A = readIntArray(N)
        println(
            solution2(A)
        )
    }
}