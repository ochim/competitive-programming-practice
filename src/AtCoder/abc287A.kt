package AtCoder

/*
287A
*/
fun main() {
    val n = readLine()!!.toInt()
    val strings = Array(n) {""}
    for (i in 0 until n) {
        strings[i] = readLine()!!.toString()
    }
    val f = strings.count { it == "For" }
    println(if (f > n/2) "Yes" else "No")
}
