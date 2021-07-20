/*
* Sorting: Distinct
*/
fun solution61(A: IntArray): Int {
    val set = mutableSetOf<Int>()
    A.forEach { set.add(it) }
    return set.size
}

fun main(args: Array<String>) {
    repeat(1) {
        println(
            solution61(intArrayOf(2,1,1,2,3,1))
        )
    }
}