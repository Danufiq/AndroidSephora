package com.example.banksephora.gabriel.screen.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.banksephora.databinding.ActivityOnBoardingGabbLoginBinding
import com.example.banksephora.main.screen.login.LoginPresenter
import showDialogEror
import showDialogSukses

class OnBoardingGabbLoginActivity : AppCompatActivity(), LoginInterfaceGabb{
    private lateinit var binding: ActivityOnBoardingGabbLoginBinding
    private lateinit var presenter: LoginPresenterGabb
    companion object {
        fun newIntent(context: Context) : Intent {
            val intent = Intent(context, ActivityOnBoardingGabbLoginBinding::class.java)
            return intent
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingGabbLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onAttach()
        init()
    }

    fun init (){
        binding.username.setHint("Username")
        binding.username.setTipeInput()
        binding.password.setHint("Password")
        binding.password.setTipeInput(true)
        binding.loginButton.setOnClickListener{
            presenter.login(binding.username.getEditText().text.toString(), binding.password.getEditText().text.toString())
        }
    }

    override fun berhasilLogin() {
        showDialogSukses()
    }

    override fun gagalLogin(pesan: String) {
        showDialogEror(pesan)
    }

    override fun onAttach() {
        presenter = LoginPresenterGabb(this)
        presenter.onAttach(this)
    }

    override fun onDetach() {
        presenter.onDetach()
    }
}