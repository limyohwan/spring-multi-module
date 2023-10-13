package com.yohwan.multimodule.controller

import com.yohwan.domain.multimodule.user.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val userService: UserService
) {
    @PostMapping("/users")
    fun addUser(
        @RequestBody request: NewUserRequest
    ) = NewUserResponse(userService.add(request.name))

    @GetMapping("/users/{userId}")
    fun findUser(
        @PathVariable userId: Long
    ) = UserResponse(userService.read(userId))
}