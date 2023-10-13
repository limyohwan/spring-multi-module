package com.yohwan.domain.multimodule.user

import org.springframework.stereotype.Component

@Component
class UserReader(
    private val userRepository: UserRepository
) {
    fun read(id: Long) = userRepository.read(id)?: throw NoSuchElementException()
}