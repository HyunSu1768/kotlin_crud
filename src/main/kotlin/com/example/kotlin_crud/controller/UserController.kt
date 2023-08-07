package com.example.kotlin_crud.controller

import com.example.kotlin_crud.entity.User
import com.example.kotlin_crud.service.UserService
import org.springframework.web.bind.annotation.*

@RequestMapping("/user")
@RestController
class UserController(
    private val userService: UserService
) {

    @PostMapping
    fun addUser(@RequestParam("username") username: String, @RequestParam("age") age: Int) {

        userService.saveUser(username, age)

    }

    @GetMapping
    fun findUser(@RequestParam("username") username: String): User = userService.findUser(username)

}