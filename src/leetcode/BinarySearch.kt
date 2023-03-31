package leetcode

fun main() {

    fun search(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.lastIndex

        while (low <= high) {
            val mid = (low + high) / 2
            val guess = nums[mid]
            if (guess == target) return mid

            if (guess > target) high = mid - 1
            else low = mid + 1
        }
        return -1
    }
}
