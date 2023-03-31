package leetcode

fun main() {
    fun search(nums: IntArray, target: Int): Boolean {
        var low = 0
        var high = nums.lastIndex

        while (low <= high) {
            val mid = (low + high) / 2
            val guess = nums[mid]
            if (guess == target) return true

            if (guess > target) high = mid - 1
            else low = mid + 1
        }
        return false
    }

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var low = 0
        var high = matrix.lastIndex

        while (low <= high) {
            val mid = (low + high) / 2
            val array = matrix[mid]
            if (array[0] <= target && target <= array[array.lastIndex]) return search(array, target)
            if (array[0] > target) high = mid - 1
            else low = mid + 1
        }
        return false
    }

    val matrix = arrayOf(intArrayOf(1,3,5,7), intArrayOf(10,11,16,20), intArrayOf(23,30,34,60))
    val target = 5
    println(searchMatrix(matrix, target))
}
