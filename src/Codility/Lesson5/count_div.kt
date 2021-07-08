/*
* Prefix Sums: CountDiv
*/
fun solutionL51(A: Int, B: Int, K: Int): Int {
    var count = 0
    for (i in A until B+1) {
        if (i % K == 0) {
            count++
        }
    }
    return count
}

fun main(args: Array<String>) {
    repeat(1) {
        println(
            solutionL51(6,11,2)
        )
        println(
            solutionL51(6,21,10)
        )
        println(
            solutionL51(0,1,11)
        )
        println(
            solutionL51(0,2000000000,1)
        )
    }
}