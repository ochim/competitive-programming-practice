/*
* Counting Elements: MissingInteger
*/
fun solutionL43(A: IntArray): Int {
    // write your code in Kotlin 1.3.11 (Linux)
    val map = mutableMapOf<Int, Int>()
    var num = -1

    for (i in A.indices) {
        map[A[i]] = i
    }

    for (i in 1 until 100002) {
        if (!map.keys.contains(i)) {
            num = i
            break
        }
    }
    return num
}

fun main(args: Array<String>) {
    repeat(1) {
        println(
            solutionL43(intArrayOf(1,3,6,4,1,2)) == 5
        )
        println(
            solutionL43(intArrayOf(1,2,3)) == 4
        )
        println(
            solutionL43(intArrayOf(-1,-3)) == 1
        )
    }
}