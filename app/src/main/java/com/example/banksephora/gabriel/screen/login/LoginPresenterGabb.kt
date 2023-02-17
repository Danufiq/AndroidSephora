package com.example.banksephora.gabriel.screen.login

import android.content.Context
import android.os.HandlerThread
import android.os.Looper
import android.util.Log
import com.example.banksephora.gabriel.model.networking.APIGabb
import com.example.banksephora.gabriel.share.base.BasePresenterGabb
import java.util.logging.Handler

class LoginPresenterGabb (private val context: Context) : BasePresenterGabb<LoginInterfaceGabb> {
    private var view: LoginInterfaceGabb? = null
    private lateinit var binding: LoginPresenterGabb
    private var API: APIGabb? = null

    override fun onAttach(view: LoginInterfaceGabb) {
        this.view = view
        if (API == null) API = APIGabb(context)
    }

    override fun onDetach() {
        view = null
    }

    //method untuk mengecek login
    fun login(username: String, password: String){
        Log.d("presenter", " username => ${username} || password => ${password}")

//        if (username.isEmpty() || password.isEmpty()){
//            view?.gagalLogin("username atau password tidak boleh kosong")
//            return
//        }
//        if (username.equals("user1", ignoreCase = true) && password.equals("pass1")){
//        if (username == "user1" && password == "pass1"){
//            view?.berhasilLogin()
//        }else{
//            view?.gagalLogin("username atau password yang anda masukkan salah")
//        }

        API?.restLogin { response ->
            val mainHandler = android.os.Handler(Looper.getMainLooper())
            mainHandler.post{
                Log.d("[PRESENTER]", "Cek response => ${response}")
            }
        }

    }

}