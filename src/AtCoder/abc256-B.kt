private fun readList() = readLine()!!.split(" ")
private fun readIntList() = readList().map { it.toInt() }

fun main() {
    val N = readLine()!!.toInt()
    val A = readIntList()
    var P = 0
    var komaStart = MutableList(4){ false }

    for (a in A) {
        val komaEnd = MutableList(4){ false }
        komaStart[0] = true

        for (j in 0 until 4) {
            if (komaStart[j]) {
                if (j + a >= 4) {
                    P++
                } else {
                    komaEnd[a] = true
                }
            }
        }
        komaStart = komaEnd
    }
    println(P)
}