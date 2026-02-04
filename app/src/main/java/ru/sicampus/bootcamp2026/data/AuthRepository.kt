package ru.sicampus.bootcamp2026.data

import ru.sicampus.bootcamp2026.data.source.AuthLocalDataSource
import ru.sicampus.bootcamp2026.data.source.AuthNetworkDataSource
import ru.sicampus.bootcamp2026.data.source.RegisterNetworkDataSource
class AuthRepository(
    private val authNetworkDataSource: AuthNetworkDataSource,
    private val authLocalDataSource: AuthLocalDataSource,
    private val registerNetworkDataSource: RegisterNetworkDataSource,
) {
    suspend fun checkAndAuth(
        login: String,
        password: String,
    ): Result<Boolean> {
        authLocalDataSource.setToken(login, password)
        return authNetworkDataSource.checkAuth()
            .onSuccess { isLogin ->
                if (!isLogin) authLocalDataSource.clearToken()
            }
            .onFailure {
                authLocalDataSource.clearToken()
            }
        }
    suspend fun register(
        login: String,
        password: String,
        confirmPassword: String
    ): Result<Unit> {
        return registerNetworkDataSource.register(login, password, confirmPassword)
            .map { userDto ->
                authLocalDataSource.setToken(login, password)
            }
    }
}



