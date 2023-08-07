package com.example.kotlin_crud.entity

import javax.persistence.*

@Entity(name = "tbl_user")
class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "username", nullable = false)
    val username: String,

    @Column(name = "age", nullable = false)
    val age: Int

)