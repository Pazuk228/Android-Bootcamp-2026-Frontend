package ru.sicampus.bootcamp2026.data.source

import kotlinx.coroutines.delay
import ru.sicampus.bootcamp2026.data.dto.UserDto

class RegisterNetworkDataSource {
    suspend fun register(
        login: String,
        password: String,
        confirmPassword: String
    ): Result<UserDto> {
        return try {
            delay(1000)

            if (password != confirmPassword) {
                return Result.failure(IllegalArgumentException("Passwords don't match"))
            }

            Result.success(
                UserDto(
                    name = login,
                    email = "@pypypy.com",
                    login = login,
                    id = 1,
                    token = "register_token_${System.currentTimeMillis()}"
                )
            )
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}