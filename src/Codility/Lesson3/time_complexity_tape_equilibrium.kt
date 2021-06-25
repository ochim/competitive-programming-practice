import java.util.StringTokenizer
import kotlin.math.absoluteValue

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
* TapeEquilibrium
*/
fun solution3(A: IntArray): Int {
    val N = A.size
    var min = Int.MAX_VALUE

    // N is an integer within the range [2..100,000]
    for (P in 1 until N) {
        var sum1 = 0
        for (i in 0 until P) {
            sum1 += A[i]
        }

        var sum2 = 0
        for (i in P until N) {
            sum2 += A[i]
        }

        val r = (sum1 - sum2).absoluteValue
        if (r <= min) min = r

    }
    return min
}

fun main(args: Array<String>) {
    repeat(1) {
        println(
            solution3(intArrayOf(3,1,2,4,3))
        )
    }
}