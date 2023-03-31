package leetcode

fun main() {
    fun isPalindrome(s: String): Boolean {
        val nonAlphanumeric = "[^0-9a-zA-Z]".toRegex()
        val converted = s.replace(nonAlphanumeric, "").toLowerCase()
        return converted == converted.reversed()
    }

    println(isPalindrome("A man, a plan, a canal: Panama"))
}
