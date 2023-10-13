package com.yohwan.multimodule.controller

import com.yohwan.domain.multimodule.user.User

data class UserResponse(
    val name: String
) {
    constructor(user: User): this(user.name)
}