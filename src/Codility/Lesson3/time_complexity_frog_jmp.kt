import java.util.StringTokenizer
import kotlin.math.ceil

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
* Time Complexity: FrogJmp
*/
fun solution(X:Int, Y:Int, D:Int): Int {
    val r: Double = ceil((Y - X) / D.toDouble())
    return r.toInt()
}

fun main(args: Array<String>) {
    repeat(readInt()) {
        val x = readInt()
        val y = readInt()
        val d = readInt()
        println(
            solution(x, y, d)
        )
    }
}