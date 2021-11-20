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
 * ABC 228 A
 */
fun main(args: Array<String>) {
    val S = readInt()
    val T = readInt()
    val X = readInt()

    if (S < T) {
        // S時からT時まで
        if ((S <= X) && (X < T)) println("Yes") else println("No")
    } else {
        // Sから0時まで、0時からT時まで
        if ((X < T) || (S <= X)) println("Yes") else println("No")
    }
}