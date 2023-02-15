package com.example.banksephora.gabriel.screen.login

import com.example.banksephora.gabriel.share.base.BaseViewGabb

interface LoginInterfaceGabb: BaseViewGabb {
    fun berhasilLogin()

    fun gagalLogin(pesan: String)
}