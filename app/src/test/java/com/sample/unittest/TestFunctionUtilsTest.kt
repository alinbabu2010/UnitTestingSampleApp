package com.sample.unittest

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class TestFunctionUtilsTest {

    @Test
    fun `fib returns 3 for n=5`() {
        val result = TestFunctionUtils.fib(5)
        assertThat(result).isEqualTo(3)
    }

    @Test
    fun `fib returns 55 for n=11`() {
        val result = TestFunctionUtils.fib(11)
        assertThat(result).isEqualTo(55)
    }

    @Test
    fun `fib returns 0 for n=0`() {
        val result = TestFunctionUtils.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `fib returns 1 for n=1`() {
        val result = TestFunctionUtils.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `fib not returns 5 for n=5`() {
        val result = TestFunctionUtils.fib(5)
        assertThat(result).isNotEqualTo(5)
    }

    @Test
    fun `checkBraces returns true for correct input`() {
        val result = TestFunctionUtils.checkBraces("((a+b)*(a-b))")
        assertThat(result).isTrue()
    }

    @Test
    fun `checkBraces returns false for incorrect input`() {
        val result = TestFunctionUtils.checkBraces("((a+b*(a-b))")
        assertThat(result).isFalse()
    }

    @Test
    fun `checkBraces returns false for not balanced paranthesis input`() {
        val result = TestFunctionUtils.checkBraces(")(a+b)(")
        assertThat(result).isFalse()
    }

}