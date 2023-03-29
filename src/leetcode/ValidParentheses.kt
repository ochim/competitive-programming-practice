package leetcode

class ValidParentheses {
    fun <T> MutableList<T>.removeLast(): T {
        return this.removeAt(lastIndex)
    }

    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        for (c in s) {
            when (c) {
                '(', '{', '[' -> stack.add(c)
                ')' -> if (stack.isEmpty() || stack.removeLast() != '(') return false
                '}' -> if (stack.isEmpty() || stack.removeLast() != '{') return false
                ']' -> if (stack.isEmpty() || stack.removeLast() != '[') return false
            }
        }
        return stack.isEmpty()
    }
}
