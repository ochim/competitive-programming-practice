package leetcode

fun main() {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val size = nums.size
        for (i in 0..size-2) {
            for(j in i+1..size-1) {
                if ( nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }

        return intArrayOf()
    }
}
