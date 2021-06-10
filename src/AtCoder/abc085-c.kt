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
* ABC 085 C - Otoshidama
*/
fun main(args: Array<String>) {
    val N = readInt()
    val Y = readInt()
    var res10000 = -1 // 10000札の枚数
    var res5000 = -1 // 5000札の枚数
    var res1000 = -1 // 1000札の枚数

    for (a in 0 until N+1) {
        for (b in 0 until N-a+1) {
            val c = N - a - b
            val total = 10000 * a + 5000 * b + 1000 * c
            if (total == Y) {
                res10000 = a
                res5000 = b
                res1000 = c
            }
        }
    }
    println("$res10000 $res5000 $res1000")
}