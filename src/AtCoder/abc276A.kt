package AtCoder

/*
A
*/
fun main() {
    val S = readLine()!!
    var index = -1
    for (i in S.indices) {
        if (S[i] == 'a') index = i + 1
    }
    println(index)
}
