package com.example.banksephora.uswa.model

import android.content.Context
import com.example.banksephora.uswa.shared.constant.BaseURL_uswa
import com.example.banksephora.uswa.shared.constant.Endpoint_uswa
import org.json.JSONObject

class API_uswa (val context: Context) {
    private val apiClient: APIClient_uswa = APIClient_uswa(context)

    fun restLogin(callback: (String) -> Unit ){
        val url = BaseURL_uswa.URL + Endpoint_uswa.LOGIN
        val jsonParam = JSONObject()
        apiClient.callRequestAPI(url, jsonParam,object : DelegateAPIRequest_uswa {
            override fun onCallSuccess(response: String) {
                callback(response)
            }
        })
    }

}