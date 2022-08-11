package HackerRank
/*
 * Complete the 'checkMagazine' function below.
 *
 * The function accepts following parameters:
 *  1. STRING_ARRAY magazine
 *  2. STRING_ARRAY note
 */

fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    // Write your code here
    var answer = "Yes"
    val magazineMap = mutableMapOf<String, Int>()
    magazine.forEach {
        if (it in magazineMap.keys) magazineMap[it] = magazineMap[it]!! + 1 else magazineMap += it to 1
    }

    for (nWord in note) {
        if (nWord in magazineMap.keys && magazineMap[nWord]!! > 0) {
            magazineMap[nWord] = magazineMap[nWord]!! - 1
        } else {
            answer = "No"
            break
        }
    }
    println(answer)
}

/*
6 5
two times three is not four
two times two is four
 */
fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = first_multiple_input[0].toInt()

    val n = first_multiple_input[1].toInt()

    val magazine = readLine()!!.trimEnd().split(" ").toTypedArray()

    val note = readLine()!!.trimEnd().split(" ").toTypedArray()

    checkMagazine(magazine, note)
}
