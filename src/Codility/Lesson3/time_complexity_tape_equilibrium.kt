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
* Time Complexity: TapeEquilibrium
*/
fun solution3(A: IntArray): Int {
    val N = A.size
    var min = Int.MAX_VALUE

    val map = mutableMapOf<Int,Int>()
    // 配列Aについて索引iまでの各要素の和を求め、mapに格納する
    map[0] = A[0]
    for (i in 1 until N) {
        map[i] = map[i-1]!! + A[i]
    }

    // N is an integer within the range [2..100,000]
    for (P in 1 until N) {
        val r = (map[P-1]!! * 2 - map[N-1]!!).absoluteValue
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