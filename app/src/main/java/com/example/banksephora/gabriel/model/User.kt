package com.example.banksephora.gabriel.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class User ( var username: String = "", var password: String = ""): Parcelable {
}