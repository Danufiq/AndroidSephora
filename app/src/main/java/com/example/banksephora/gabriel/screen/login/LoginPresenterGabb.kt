package com.example.banksephora.gabriel.screen.login

import android.content.Context
import android.util.Log
import com.example.banksephora.gabriel.share.base.BasePresenterGabb

class LoginPresenterGabb (private val context: Context) : BasePresenterGabb<LoginInterfaceGabb> {
    private var view: LoginInterfaceGabb? = null
    private lateinit var binding: LoginPresenterGabb

    override fun onAttach(view: LoginInterfaceGabb) {
        this.view = view
    }

    override fun onDetach() {
        view = null
    }

    //method untuk mengecek login
    fun login(username: String, password: String){
        Log.d("presenter", " username => ${username} || password => ${password}")

        if (username.isEmpty() || password.isEmpty()){
            view?.gagalLogin("username atau password tidak boleh kosong")
            return
        }

        if (username == "user1" && password == "pass1"){
            view?.berhasilLogin()
        }else{
            view?.gagalLogin("username atau password yang anda masukkan salah")
        }

    }

}