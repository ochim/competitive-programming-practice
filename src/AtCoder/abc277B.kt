package AtCoder

/*
277B
*/
fun main() {
    val N = readLine()!!.toInt()
    val S = Array(N) {""}
    for (i in 0 until N) {
        S[i] = readLine()!!
    }

    var b = true
    val first = arrayOf('H', 'D', 'C', 'S')
    val second = arrayOf('A' , '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K')
    for (s in S) {
        if (s[0] !in first || s[1] !in second) {
            b = false
            break
        }
    }

    if (S.toSet().size != N) b = false

    println(if (b) "Yes" else "No")
}
