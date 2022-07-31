package HackerRank

/*
 * Complete the 'isFibo' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts LONG_INTEGER n as parameter.
 */

fun isFibo(n: Long): String {
    // Write your code here
    val fibos = mutableListOf<Long>()
    fibos.add(0)
    fibos.add(1)
    var index = 2
    while (true) {
        fibos.add(fibos[index - 2] + fibos[index - 1])
        val max = fibos.last()

        if (n in fibos) {
            return ("IsFibo")
        } else if (n < max) {
            return("IsNotFibo")
        }
        index += 1
    }
}

fun main(args: Array<String>) {
    /*
    3
    5
    7
    8
     */
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toLong()

        val result = isFibo(n)

        println(result)
    }
}
