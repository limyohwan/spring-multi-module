package com.yohwan.storage.db.main

import jakarta.persistence.Entity

@Entity
internal class UserEntity(
    val name: String
) : BaseEntity()