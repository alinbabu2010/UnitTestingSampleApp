package com.sample.unittest

object TestFunctionUtils {

    /**
     * Returns the n-th fibonacci number
     * Sequence staring with 0
     * They are defined like this:
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-2) + fib(n-1)
     */
    fun fib(n: Int): Long {
        if (n == 0 || n == 1) {
            return n.toLong()
        }
        var a = 0L
        var b = 1L
        var c = 1L
        (1..n - 2).forEach { i ->
            c = a + b
            a = b
            b = c
        }
        return c
    }

    private fun isBalanced(exp: String): Boolean {

        // Initialising variables
        var flag = true
        var count = 0

        // Traversing the expression
        for (element in exp) {
            if (element == '(') {
                count++
            } else if (element == ')') {
                count--
            }
            if (count < 0) {
                // This means there are
                // more Closing parenthesis
                // than opening ones
                flag = false
                break
            }
        }

        // If count is not zero,
        // It means there are
        // more opening parenthesis
        if (count != 0) {
            flag = false
        }
        return flag
    }

    /**
     * Checks if the braces are set correctly
     * e.g. "(a * b))" should return false
     */
    fun checkBraces(string: String): Boolean {
        return string.count { it == '(' } == string.count { it == ')' }
    }

}