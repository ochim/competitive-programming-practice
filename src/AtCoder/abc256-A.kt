import kotlin.math.pow

// 0<= N <= 30
fun main() {
    val N = readLine()!!.toInt()
    println(2.toDouble().pow(N).toInt())
}