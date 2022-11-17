package com.sample.unittest

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilsTest {


    @Test
    fun `empty users returns false`() {
        val result = RegistrationUtils.validateFormInput(
            username = "",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correct repeated password returns true`() {
        val result = RegistrationUtils.validateFormInput(
            username = "Alin",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtils.validateFormInput(
            username = "Carl",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtils.validateFormInput(
            username = "Carl",
            password = "",
            confirmedPassword = ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password repeated incorrectly returns false`() {
        val result = RegistrationUtils.validateFormInput(
            username = "Carl",
            password = "1239",
            confirmedPassword = "1238"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password less than 2 digits returns false`() {
        val result = RegistrationUtils.validateFormInput(
            username = "Carl",
            password = "12",
            confirmedPassword = "12"
        )
        assertThat(result).isFalse()
    }


}