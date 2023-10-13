package com.yohwan.storage.db.main

import com.yohwan.domain.user.User
import com.yohwan.domain.user.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository

@Repository
internal class UserEntityRepository(
    private val userJpaRepository: UserJpaRepository
) : UserRepository {
    override fun add(name: String) = userJpaRepository.save(
        UserEntity(name = name)
    ).id!!

    override fun read(id: Long) = userJpaRepository.findByIdOrNull(id)?.let {
        User(
            id = it.id!!,
            name = it.name
        )
    }
}