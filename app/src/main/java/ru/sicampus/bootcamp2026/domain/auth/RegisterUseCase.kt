package ru.sicampus.bootcamp2026.domain.auth

import ru.sicampus.bootcamp2026.data.AuthRepository

class RegisterUseCase(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(
        login: String,
        password: String,
        confirmPassword: String
    ): Result<Unit> {
        return repository.register(login, password, confirmPassword)
    }
}