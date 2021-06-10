import java.util.StringTokenizer

private val INPUT = System.`in`

private val bufferedReader = INPUT.bufferedReader()
private fun readLn() = bufferedReader.readLine()!!

private fun readList() = readLn().split(' ')
private var tokenizer = StringTokenizer("")
private fun read(): String {
    while (tokenizer.hasMoreTokens().not()) tokenizer = StringTokenizer(readLn(), " ")
    return tokenizer.nextToken()
}

private fun readIntList() = readList().map { it.toInt() }

/*
 * 2. OddOccurrencesInArray
 */
fun solution(A: IntArray): Int {
    /*
    可変のmapを作る。
    Aの各要素をキーにして、mapに格納する。
    すでにキーが合ったら、既存の値に1を足す。
    キーがない場合は１をいれる。
    mapの全要素から値が奇数のものを探す。
    その要素のキーを返す
     */
    val map = mutableMapOf<Int, Int>()
    for (n in A) {
        if (map.containsKey(n)) {
            map[n] = map[n]!! + 1
        } else {
            map[n] = 1
        }
    }
    var res = 0
    for (k in map.keys) {
        if (map[k]!! % 2 == 1) {
            res = k
            break
        }
    }
    return res
    /*
    方法１：これはパフォーマンステストでNGだった

    val s = A.size
    var r = 0
    for (i in 0 until s) {
        println(A.toMutableList())
        if (i == s-1) {
            r = A[i]
            break
        }

        if (A[i] == 0) continue

        var b = false
        for (j in i+1 until s) {
            if (A[j] == A[i]) {
                A[j] = 0
                b = true
                break
            }
        }
        if (!b) {
            r = A[i]
            break
        }
    }
    return r
     */
}

fun main(args: Array<String>) {
    repeat(1) {
        val A = readIntList()
        println(
            solution(A.toIntArray())
        )
    }
}