import java.util.*

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
abc 086 A - Product
 */
fun main(args: Array<String>) {
    val a = readInt()
    val b = readInt()

    if (a * b % 2 == 0) {
        println("Even")
    } else {
        println("Odd")
    }
}
