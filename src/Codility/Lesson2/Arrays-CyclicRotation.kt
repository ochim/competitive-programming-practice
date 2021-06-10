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

/*
 * 1. CyclicRotation
 * K回ローテンションする
 */
fun solution(A: IntArray, K:Int): IntArray {
    var result = A
    repeat(K) {
        result = rotation(result)
    }

    return result
}

fun rotation(A: IntArray): IntArray {
    val s = A.size
    val b = IntArray(s) {0}
    for (i in 0 until s) {
        if (i == 0) {
            b[i] = A[s-1]
        } else {
            b[i] = A[i-1]
        }
    }
    return b
}

fun main(args: Array<String>) {
    repeat(1) {
        println(
            solution(intArrayOf(1,2,3,4), 4).toList()
        )
    }
}