package ru.sicampus.bootcamp2026.ui.theme.screen.register

sealed interface RegisterState {
    object Loading: RegisterState
    data class Data(
        val isEnabledSend: Boolean,
        val error: String?,
        val successMessage: String?,
        val passwordError: String?,
        val confirmPasswordError: String?
    ): RegisterState
}