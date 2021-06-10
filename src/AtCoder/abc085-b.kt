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
* ABC 085 B - Kagami Mochi
*/
fun main(args: Array<String>) {
    val N = readInt()
    val d = mutableListOf<Int>()
    repeat(N) {
        d.add(readInt())
    }

    // 集合にして数値の重複を取り除く
    val set = d.toMutableSet()
    println(set.size)
}