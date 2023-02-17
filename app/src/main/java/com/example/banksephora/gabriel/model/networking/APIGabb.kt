package com.example.banksephora.gabriel.model.networking

import android.content.Context
import com.example.banksephora.gabriel.share.constant.BaseURLGabb
import com.example.banksephora.gabriel.share.constant.EndpointGabb
import com.example.banksephora.main.shared.constant.BaseURL
import com.example.banksephora.main.shared.constant.Endpoint
import org.json.JSONObject

class APIGabb (val context: Context){
    private val apiClient: APIClientGabb = APIClientGabb(context)

    fun restLogin (callBack: (String) -> Unit){
        var url = BaseURL.URL + Endpoint.LOGIN
        val jsonParam = JSONObject()
        apiClient.callRequestAPI(url, jsonParam, object : DelegateAPIRequestGab{
            override fun onCallSuccess(response: String) {
                callBack(response)
            }
        })
    }
}