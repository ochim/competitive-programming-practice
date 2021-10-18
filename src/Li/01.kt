/*
* 1. 文字列Sを受け取って、重複している文字の種類数を返す
*/
fun solutionL01(S: String): Int {
    // write your code in Kotlin 1.3.11 (Linux)
    val map = mutableMapOf<Char, Int>()
    for (i in S.indices) {
        val c = S[i]
        if (map.containsKey(c)) {
            map[c] = map[c]!! + 1
        } else {
            map[c] = 1
        }
    }
    return map.filterValues { it > 1 }.keys.size
}

fun main(args: Array<String>) {
    repeat(1) {
        println(
            solutionL01("foobbazzzfoo")
        )
        println(
            solutionL01("aabbcccd")
        )
    }
}