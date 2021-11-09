/*
* 3.独自のデータ型
*/
fun solutionL3(A: Array<String>): IntArray {
    // write your code in Kotlin 1.3.11 (Linux)
    val custom = Custom()
    try {
        for (i in A.indices) {
            val readList = A[i].split(" ")
            when (readList[0]) {
                "exit" -> {
                    break
                }
                "add" -> {
                    custom.add(readList[1].toInt(), readList[2].toInt())
                }
                "get" -> {
                    custom.get(readList[1].toInt())
                }
                "remove" -> {
                    custom.remove(readList[1].toInt())
                }
                "evict" -> {
                    custom.evict()
                }
                else -> {
                    break
                }
            }
        }
    } catch(e: Exception) {
    }
    return custom.output()
}

class Custom {
    var inputMap = mutableMapOf<Int, Int>()
    var outputList = mutableListOf<Int>()
    var usedKeys = mutableListOf<Int>()

    fun add(key: Int, value: Int) {
        inputMap[key] = value
        usedKeys.remove(key)
        usedKeys.add(key)
    }

    fun get(key: Int) {
        if (inputMap.containsKey(key)) {
            outputList.add(inputMap[key]!!)
            usedKeys.remove(key)
            usedKeys.add(key)
        } else {
            outputList.add(-1)
        }
    }

    fun remove(key: Int) {
        if (inputMap.containsKey(key)) {
            outputList.add(inputMap.remove(key)!!)
        } else {
            outputList.add(-1)
        }
    }

    fun evict() {
        if (usedKeys.size > 0) inputMap.remove(usedKeys[0])
    }

    fun output() : IntArray = outputList.toIntArray()

}

fun main(args: Array<String>) {
    repeat(1) {
        println(
            solutionL3(arrayOf("add 1 2", "get 1", "exit")).forEach { print("$it,") }
        )
        println(
            solutionL3(arrayOf("add 1 2", "get", "exit"))
        )
    }
}