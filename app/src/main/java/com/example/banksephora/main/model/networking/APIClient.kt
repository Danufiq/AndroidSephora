package com.example.banksephora.main.model.networking

import android.content.Context
import android.util.Log
import com.example.banksephora.main.shared.constant.BaseURL
import com.example.banksephora.main.shared.constant.Endpoint
import okhttp3.*
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import java.io.IOException

class APIClient(val context: Context) {


    fun callRequestAPI(url: String,params: JSONObject, delegateAPIRequest: DelegateAPIRequest){
        val okHttpClient = OkHttpClient()
        val request = Request.Builder()
            .method("POST", params.toString().toRequestBody())
            .url(url)
            .build()

        var call = okHttpClient.newCall(request)
        call.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                Log.d("presenter", " gagal")
            }

            override fun onResponse(call: Call, response: Response) {
                delegateAPIRequest.onCallSuccess("${response.body?.string()}")
            }
        })
    }

}