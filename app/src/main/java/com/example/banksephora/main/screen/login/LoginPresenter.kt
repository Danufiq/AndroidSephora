package com.example.banksephora.main.screen.login

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import com.example.banksephora.main.model.networking.API
import com.example.banksephora.main.shared.base.BasePresenter
import com.example.banksephora.main.shared.constant.BaseURL
import com.example.banksephora.main.shared.constant.Endpoint
import com.google.gson.Gson
import okhttp3.*
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import java.io.IOException
import java.util.concurrent.TimeUnit


class LoginPresenter (private val context: Context) : BasePresenter<LoginInterface> {

    private var view: LoginInterface? = null
    private var API: API? = null

    override fun onAttach(view: LoginInterface) {
        this.view = view
        if (API == null) API = API(context)
    }

    override fun onDetach() {
        view = null
    }


    fun login(username: String, password: String){
        Log.d("presenter", " username => ${username} || password => ${password}")

//        if (username.isEmpty() || password.isEmpty()){
//            view?.onFailedLogin("username atau password tidak boleh kosong")
//            return
//        }
        API?.restLogin { response ->
            val mainHandler = Handler(Looper.getMainLooper())
            mainHandler.post {
                Log.d("presenter", " cek response => ${response}")
                validationLogin(response)
            }
        }
    }

    fun validationLogin(response: String){
//        if (response == "user1" && password == "pass1"){
//            view?.onSuccessLogin()
//        }else{
//            view?.onFailedLogin("username atau password yang anda masukkan salah")
//        }
    }

}