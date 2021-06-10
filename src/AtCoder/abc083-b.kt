/*
* abc 083 B
* Some Sums
* 1以上 N以下の整数のうち、10進法で各桁の和が A以上 B以下であるものについて、総和を求めてください。
*/
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

// 各桁の和を求める
private fun findSumOfDigits(num: Int) : Int {
    var sum = 0
    var tmp = num
    while (tmp > 0) {
        sum += tmp % 10
        tmp /= 10
    }
    return sum
}

fun main(args: Array<String>) {
    val N = readInt()
    val A = readInt()
    val B = readInt()

    var total = 0
    for (i in 1..N) {
        val sum = findSumOfDigits(i)
        if (sum >= A && sum <= B) total += i
    }

    println(total)
}