package ru.sicampus.bootcamp2026.data

import ru.sicampus.bootcamp2026.data.source.UserInfoDataSource
import ru.sicampus.bootcamp2026.domain.entities.PagingUserListEntity
import ru.sicampus.bootcamp2026.domain.entities.UserEntity


class UserRepository(
    private val userInfoDataSource: UserInfoDataSource
) {
    suspend fun getUsers(
        page: Int,
        size: Int
    ): Result<PagingUserListEntity> {
        //delay(2_000)
        //if (Math.random() > 0.8) return Result.failure(IllegalStateException("Ops"))
        return userInfoDataSource.getUser(
            page = page,
            size = size,
        ).mapCatching { dto ->
            PagingUserListEntity(
                isLast = dto.last ?: true,
                users = dto.content?.mapNotNull { userDto ->
                    UserEntity(
                        name = userDto.name ?: return@mapNotNull null,
                        email = userDto.email ?: return@mapNotNull null,
                    )
                } ?: error("List is null")
            )
        }
    }
}