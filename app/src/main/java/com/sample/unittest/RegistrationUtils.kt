package com.sample.unittest

object RegistrationUtils {

    private val existingUsers = listOf("Peter", "Carl")

    /**
     * The input is not valid if..
     * ...the username/password is empty
     * ...the username is already taken
     * ...the confirmed password is not the same as the real password
     * ...the password contains less than 2 digits
     */
    fun validateFormInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {

        return true

    }


}