package com.yohwan.domain.multimodule.user

import org.springframework.stereotype.Component

@Component
class UserWriter(
    private val userRepository: UserRepository
) {
    fun add(name: String) = userRepository.add(name)
}