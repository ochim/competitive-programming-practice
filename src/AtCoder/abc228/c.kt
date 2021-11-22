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

private fun readIntList() = readList().map { it.toInt() }

/*
* ABC 228 C
*/
fun main(args: Array<String>) {
    val N = readInt()
    val K = readInt()
    val P = mutableListOf<Int>()
    repeat(N) {
        val j = readIntList()
        P.add(j.sum())
    }

    // 3日目までの上位得点順を作る
    val Q = P.sorted().reversed()

    for (i in 0 until N) {
        val highScore = P[i] + 300
        if (highScore >= Q[K-1]) println("Yes") else println("No")
    }
}