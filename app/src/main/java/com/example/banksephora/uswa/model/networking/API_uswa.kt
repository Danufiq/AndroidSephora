package com.example.banksephora.uswa.model.networking

import android.content.Context
import com.example.banksephora.uswa.model.user_uswa
import com.example.banksephora.uswa.shared.constant.BaseURL_uswa
import com.example.banksephora.uswa.shared.constant.Endpoint_uswa
import com.google.gson.Gson
import org.json.JSONObject

class API_uswa (val context: Context) {
    private val apiClient: APIClient_uswa = APIClient_uswa(context)

    fun restLogin(callback: (user_uswa) -> Unit ){
        val url = BaseURL_uswa.URL + Endpoint_uswa.LOGIN
        val jsonParam = JSONObject()
        apiClient.callRequestAPI(url, jsonParam,object : DelegateAPIRequest_uswa {
            override fun onCallSuccess(response: String) {
                var user = Gson().fromJson(response, user_uswa::class.java)
                callback(user)
            }
        })
    }

}