package com.example.mvvmarchitecture.data.network.responses

import com.example.mvvmarchitecture.database.entities.User



data class AuthResponses (
    val token:String?,
    val user : User?
        )