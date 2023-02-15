package com.example.banksephora.main.screen.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.banksephora.R
import com.example.banksephora.databinding.ActivityLoginBinding
import com.example.banksephora.main.shared.ui.showDialog

class LoginActivity : AppCompatActivity(), LoginInterface {
    private lateinit var binding : ActivityLoginBinding
    private lateinit var presenter: LoginPresenter
    companion object {
        fun newIntent(context: Context) : Intent {
            val intent = Intent(context, LoginActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onAttach()
        initView()

    }
    override fun onAttach() {
        presenter = LoginPresenter(this)
        presenter.onAttach(this)
    }

    override fun onDetach() {
        presenter.onDetach()
    }

    override fun onSuccessLogin() {
        showDialog("login berhasil")
    }

    override fun onFailedLogin(message: String) {
        showDialog(message)
    }


    fun initView(){
        binding.header.setTitle("BANK sephora test")
        binding.etUsername.setPlaceholder("Username")
        binding.etUsername.setTypePassword()
        binding.etPass.setPlaceholder("Password")
        binding.etPass.setTypePassword(true)
        binding.btnLogin.setOnClickListener{
            presenter.login(binding.etUsername.getEditText().text.toString(), binding.etPass.getEditText().text.toString())
        }
//        showDialog("test Dialog")
    }



}