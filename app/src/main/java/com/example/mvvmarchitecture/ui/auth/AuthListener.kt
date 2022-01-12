package com.example.mvvmarchitecture.ui.auth

import com.example.mvvmarchitecture.database.entities.User

interface AuthListener {

    fun onStarted()
    fun onSuccess(user:User)
    fun onFailure(message: String)

}