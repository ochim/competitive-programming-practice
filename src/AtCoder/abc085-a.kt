import java.util.StringTokenizer

private val INPUT = System.`in`

private val bufferedReader = INPUT.bufferedReader()
private fun readLn() = bufferedReader.readLine()!!

private var tokenizer = StringTokenizer("")
private fun read(): String {
    while (tokenizer.hasMoreTokens().not()) tokenizer = StringTokenizer(readLn(), " ")
    return tokenizer.nextToken()
}

/*
* ABC 085 A - Already2018
* Sは10文字の文字列
 */
fun main(args: Array<String>) {
    val S = read()
    val sub = S.substring(4, 10)
    println("2018$sub")
}
// https://kita-note.com/kotlin-substring
