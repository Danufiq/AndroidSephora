package com.example.banksephora.uswa.screen.login

import android.content.Context
import android.util.Log
import com.example.banksephora.uswa.screen.login.LoginInterface
import com.example.banksephora.uswa.shared.base.BasePresenter

class LoginPresenter (private val context: Context) : BasePresenter<LoginInterface> {

    private var view: LoginInterface? = null
    //private var API: API? = null

    override fun onAttach(view: LoginInterface) {
        this.view = view
    }

    override fun onDetach() {
        view = null
    }

    fun login(username: String, password: String){
        Log.d("presenter", " username => ${username} || password => ${password}")

        if (username.isEmpty() || password.isEmpty()){
            view?.onFailedLogin("username atau password tidak boleh kosong")
            return
        }

        if (username == "user1" && password == "pass1"){
            view?.onSuccessLogin()
        }else{
            view?.onFailedLogin("username atau password yang anda masukkan salah")
        }

    }
}