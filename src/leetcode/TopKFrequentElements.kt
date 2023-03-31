package leetcode

/*
Top K Frequent Elements
 */
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    nums.forEach {
        if (it in map.keys) map[it] = map[it]!! + 1 else map += it to 1
    }
    val target = map.toList().sortedByDescending { it.second }.take(k).toMap()
    return target.keys.toIntArray()
}
