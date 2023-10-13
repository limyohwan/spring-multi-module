package com.yohwan.domain.user

import org.springframework.stereotype.Service

@Service
class UserService (
    private val userWriter: UserWriter,
    private val userReader: UserReader
) {
    fun add(name: String) = userWriter.add(name)

    fun read(id: Long) = userReader.read(id)
}