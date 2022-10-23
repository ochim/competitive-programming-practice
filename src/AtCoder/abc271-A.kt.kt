package AtCoder

/*
ABC271 A
 */
fun main() {
    val N = readLine()!!.toInt()
    println(N.toString(16).toUpperCase().padStart(2, '0'))
}

fun main1() {
    val N = readLine()!!.toInt()
    val a = N / 16
    val b = N % 16

    if (a <= 9) print(a) else print(('A' + a - 10).toChar())

    if (b <= 9) print(b) else print(('A' + b - 10).toChar())
}
