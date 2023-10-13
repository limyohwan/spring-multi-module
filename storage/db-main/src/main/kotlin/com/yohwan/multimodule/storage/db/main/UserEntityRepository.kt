package com.yohwan.multimodule.storage.db.main

import com.yohwan.domain.multimodule.user.User
import com.yohwan.domain.multimodule.user.UserRepository
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