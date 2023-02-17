package com.example.banksephora.main.model.networking

import android.content.Context
import com.example.banksephora.main.shared.constant.BaseURL
import com.example.banksephora.main.shared.constant.Endpoint
import com.google.gson.Gson
import org.json.JSONObject

class API(val context: Context) {
    private val apiClient: APIClient = APIClient(context)

    fun restLogin(callback: (User) -> Unit){
        val url = BaseURL.URL + Endpoint.LOGIN
        val jsonParam = JSONObject()
        apiClient.callRequestAPI(url, jsonParam,object : DelegateAPIRequest {
            override fun onCallSuccess(response: String) {
                var user = Gson().fromJson(response,User::class.java)
                callback(user)
            }
        })
    }

}