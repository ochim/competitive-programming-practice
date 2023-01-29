package AtCoder

/*
287B
*/
fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val s = Array(n) {""}
    val t = Array(m) {""}

    for (i in 0 until n) {
        s[i] = readLine()!!.toString()
    }
    for (i in 0 until m) {
        t[i] = readLine()!!.toString()
    }
    var count = 0
    s.forEach {
        val suffix = it.substring(3)
        count += if (t.find { it == suffix }.isNullOrEmpty()) 0 else 1
    }
    println(count)
}
