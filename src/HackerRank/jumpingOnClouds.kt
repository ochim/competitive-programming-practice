package HackerRank

/*
 * Complete the 'jumpingOnClouds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY c as parameter.
 */

fun jumpingOnClouds(c: Array<Int>): Int {
    // Write your code here
    val s = c.size
    var i = 0
    var count = 0
    while (i < s-2) {
        if (c[i+2] == 0) i += 2 else i++
        count++
    }
    if (i == s-2) count++

    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val c = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)
    println(result)
//    var result = jumpingOnClouds(arrayOf(0,0,1,0,0,1,0))
//    println(result)
//    result = jumpingOnClouds(arrayOf(0,0,0,1,0,0))
//    println(result)
}
