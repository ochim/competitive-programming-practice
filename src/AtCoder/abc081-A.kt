import java.util.*

private val INPUT = System.`in`

private val bufferedReader = INPUT.bufferedReader()

private fun readLn() = bufferedReader.readLine()!!
private var tokenizer = StringTokenizer("")
private fun read(): String {
    while (tokenizer.hasMoreTokens().not()) tokenizer = StringTokenizer(readLn(), " ")
    return tokenizer.nextToken()
}

/*
abc 081 A
 */
fun main(args: Array<String>) {
    val s = read()
    var count = 0

    if (s[0] == '1') count++
    if (s[1] == '1') count++
    if (s[2] == '1') count++

    println(count)
}
