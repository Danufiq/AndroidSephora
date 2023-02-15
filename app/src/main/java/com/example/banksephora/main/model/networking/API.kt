package com.example.banksephora.main.model.networking

import android.content.Context
import com.example.banksephora.main.shared.constant.BaseURL
import com.example.banksephora.main.shared.constant.Endpoint
import org.json.JSONObject

class API(val context: Context) {
    private val apiClient: APIClient = APIClient(context)

    fun restLogin(callback: (String) -> Unit){
        val url = BaseURL.URL + Endpoint.LOGIN
        val jsonParam = JSONObject()
        apiClient.callRequestAPI(url, jsonParam,object : DelegateAPIRequest {
            override fun onCallSuccess(response: String) {
                callback(response)
            }
        })
    }

}