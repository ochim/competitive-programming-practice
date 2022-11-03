package AtCoder.ABS

/*
ABC049C - 白昼夢
 */
fun main() {
    val S = readLine()!!
    // 後ろから解くかわりにすべての文字列を「左右反転」する
    val rS = S.reversed()
    val divide = arrayOf("dream", "dreamer", "erase", "eraser").map { it.reversed() }

    // 端から切っていく
    var can = true
    var i = 0
    while (i < rS.length) {
        var can2 = false
        for (j in 0 until 4) {
            val d = divide[j]
            if (i + d.length <= rS.length && rS.substring(i, i + d.length) == d) {
                can2 = true
                i += d.length
            }
        }
        if (!can2) {
            can = false
            break
        }
    }

    if (can) println("YES") else println("NO")
}
