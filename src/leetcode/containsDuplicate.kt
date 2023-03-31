package leetcode

fun main() {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.size != nums.toSet().size
    }
}
