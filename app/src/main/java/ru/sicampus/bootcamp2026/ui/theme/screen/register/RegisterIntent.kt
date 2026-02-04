package ru.sicampus.bootcamp2026.ui.theme.screen.register

sealed interface RegisterIntent {
    data class Send(
        val login: String,
        val password: String,
        val confirmPassword: String
    ): RegisterIntent

    data class TextInput(
        val login: String,
        val password: String,
        val confirmPassword: String
    ): RegisterIntent

    object BackClicked : RegisterIntent
    object SuccessMessageShown : RegisterIntent
}