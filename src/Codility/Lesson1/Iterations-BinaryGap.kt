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

//
// 1. BinaryGap
private fun solution(N: Int): Int {
    if (N <= 4) return 0

    val binary = N.toString(2)
    val l = binary.length

    var flag = true
    var max = 0
    var count = 0
    for (i in 1 until l) {
        if (flag) {
            if (binary[i] == '0') {
                count++
            } else {
                if (max < count) max = count
                count = 0
                flag = false
            }
        } else {
            if (binary[i] == '0') {
                count++
                flag = true
            }
        }
    }
    return max
}

fun main(args: Array<String>) {
    repeat(readInt()) {
        val n = readInt()
        println(solution(n))
    }
}