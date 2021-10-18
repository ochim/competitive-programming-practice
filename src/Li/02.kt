/*
* 2. 受け取った数字Aを３桁カンマ区切りに変換して返す
*/
fun solutionL2(A: Int): String {
    // write your code in Kotlin 1.3.11 (Linux)
    return "%,d".format(A)
}

fun main(args: Array<String>) {
    repeat(1) {
        println(
            solutionL2(1333455)
        )
        println(
            solutionL2(-3)
        )
    }
}