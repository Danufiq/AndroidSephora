package com.example.banksephora.uswa.screen.login

import com.example.banksephora.uswa.shared.base.BaseView

interface LoginInterface : BaseView {

    fun onSuccessLogin()

    fun onFailedLogin(message: String)
}