package leetcode

fun main() {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        var b = true
        for (c in s.toSet()) {
            if (s.count {it == c} != t.count {it == c}) {
                b = false
                break
            }
        }
        return b
    }
}
