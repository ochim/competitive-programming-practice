/*
* Counting Elements: FrogRiverOne
*/
fun solution(X: Int, A: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    var num = -1

    for (i in A.indices) {
        map[A[i]] = i
        if (map.keys.size == X) {
            num = i
            break
        }
    }
    return num
}

fun main(args: Array<String>) {
    repeat(1) {
        println(
            solution(5, intArrayOf(1,3,1,4,2,3,5,4)) == 6
        )
    }
}