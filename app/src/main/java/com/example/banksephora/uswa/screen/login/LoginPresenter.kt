package com.example.banksephora.uswa.screen.login

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.example.banksephora.uswa.model.user_uswa
import com.example.banksephora.uswa.model.networking.API_uswa
import com.example.banksephora.uswa.shared.base.BasePresenter

class LoginPresenter (private val context: Context) : BasePresenter<LoginInterface> {

    private var view: LoginInterface? = null
    private var API: API_uswa? = null

    override fun onAttach(view: LoginInterface) {
        this.view = view
        if (API == null) API = API_uswa(context)
    }

    override fun onDetach() {
        view = null
    }

//    fun login(username: String, password: String){
//        Log.d("presenter", " username => ${username} || password => ${password}")
//
//        if (username.isEmpty() || password.isEmpty()){
//            view?.onFailedLogin("username atau password tidak boleh kosong")
//            return
//        }
//
//        if (username == "user1" && password == "pass1"){
//            view?.onSuccessLogin()
//        }else{
//            view?.onFailedLogin("username atau password yang anda masukkan salah")
//        }
//
//    }


    fun login(username: String, password: String){
        Log.d("presenter", " username => ${username} || password => ${password}")

//        if (username.isEmpty() || password.isEmpty()){
//            view?.onFailedLogin("username atau password tidak boleh kosong")
//            return
//        }
        API?.restLogin {  user  ->
            val mainHandler = Handler(Looper.getMainLooper())
            mainHandler.post {
                Log.d("presenter", " cek response => ${user}")
                //validationLogin(user)
                if (user.username == "${username}" && user.password == "${password}"){
                    view?.onSuccessLogin()
                }else{
                    view?.onFailedLogin("username atau password yang anda masukkan salah")
                }
            }
        }
    }

    fun validationLogin(user: user_uswa ){
        if (user.username == "Dodit" && user.password == "Dodit 123"){
            view?.onSuccessLogin()
        }else{
            view?.onFailedLogin("username atau password yang anda masukkan salah")
        }
    }
}