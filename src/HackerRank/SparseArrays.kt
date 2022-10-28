package HackerRank

/*
 * Complete the 'matchingStrings' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. STRING_ARRAY stringList
 *  2. STRING_ARRAY queries
 */

fun matchingStrings(stringList: Array<String>, queries: Array<String>): Array<Int> {
    // Write your code here
    val hits = mutableListOf<Int>()
    for (query in queries) {
        var hit = 0
        for (string in stringList) {
            if (query == string) hit++
        }
        hits.add(hit)
    }
    return hits.toTypedArray()
}

fun main(args: Array<String>) {
    val stringListCount = readLine()!!.trim().toInt()

    val stringList = Array<String>(stringListCount, { "" })
    for (i in 0 until stringListCount) {
        val stringListItem = readLine()!!
        stringList[i] = stringListItem
    }

    val queriesCount = readLine()!!.trim().toInt()

    val queries = Array<String>(queriesCount, { "" })
    for (i in 0 until queriesCount) {
        val queriesItem = readLine()!!
        queries[i] = queriesItem
    }

    val res = matchingStrings(stringList, queries)

    println(res.joinToString("\n"))
}
