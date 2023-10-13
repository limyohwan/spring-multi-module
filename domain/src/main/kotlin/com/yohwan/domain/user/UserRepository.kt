package com.yohwan.domain.user

interface UserRepository {
    fun add(name: String): Long
    fun read(id: Long): User?
}