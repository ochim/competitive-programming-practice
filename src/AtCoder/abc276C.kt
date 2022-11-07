package AtCoder

/*
C - Previous Permutation
 */
fun main() {
    val N = readLine()!!.toInt()
    val P = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    var j = N - 2
    while (P[j] < P[j+1]) {
        j--
    }
    var k = N-1
    while (P[j] < P[k]) {
        k--
    }

    val i = P[j]
    P[j] = P[k]
    P[k] = i

    val back = P.slice(j+1..P.size-1).reversed()
    val forward = P.slice(0..j).toMutableList()
    forward.addAll(back)
    println(forward.joinToString(separator = " "))
}
