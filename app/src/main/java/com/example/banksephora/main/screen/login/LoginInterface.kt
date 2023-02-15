package com.example.banksephora.main.screen.login

import com.example.banksephora.main.shared.base.BaseView

interface LoginInterface: BaseView {

    fun onSuccessLogin()

    fun onFailedLogin(message: String)

}