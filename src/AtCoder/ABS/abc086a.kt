package AtCoder

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val r = (a * b) % 2
    println(if (r == 0) "Even" else "Odd")
}
