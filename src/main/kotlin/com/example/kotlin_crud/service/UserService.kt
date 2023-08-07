package com.example.kotlin_crud.service

import com.example.kotlin_crud.entity.User
import com.example.kotlin_crud.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun saveUser(username: String, age: Int) {

        val user = User(
            username = username,
            age = age
        )

        userRepository.save(user)

    }

    fun findUser(username: String): User = userRepository.findByUsername(username).orElseThrow()

}