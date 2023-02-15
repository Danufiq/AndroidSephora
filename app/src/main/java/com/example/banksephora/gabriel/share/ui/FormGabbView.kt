package com.example.banksephora.gabriel.share.ui

import android.content.Context
import android.text.InputType
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import com.example.banksephora.R
import com.example.banksephora.databinding.FormViewGabbBinding

class FormGabbView: ConstraintLayout {
    private lateinit var binding: FormViewGabbBinding
    private lateinit var mContext: Context
    var mataTutup = false

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context, attrs)
    }

    private fun init(context: Context, attributeSet: AttributeSet?) {
        mContext = context
        binding = FormViewGabbBinding.bind(LayoutInflater.from(mContext).inflate(R.layout.form_view_gabb, this, true))
    }
    fun setHint (hint: String){
        binding.ketikUsername.hint = hint
//        binding.ketikUsername.setInputType(InputType.TYPE_CLASS_TEXT)
    }

    fun setTipeInput (_password: Boolean = false){
        if (_password){
            binding.ketikUsername.setInputType(InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD)
            binding.hidenMata.setOnClickListener {
                if(mataTutup){
                    binding.ketikUsername.transformationMethod = HideReturnsTransformationMethod.getInstance()
                    mataTutup = false
                    binding.hidenMata.setImageDrawable(resources.getDrawable(R.drawable.mata))
                } else{
                    binding.ketikUsername.transformationMethod = PasswordTransformationMethod.getInstance()
                    mataTutup = true
                    binding.hidenMata.setImageDrawable(resources.getDrawable(R.drawable.mata))
                }
            }
        } else {
            binding.hidenMata.visibility = GONE
        }
    }

    fun getEditText() : EditText {
        return binding.ketikUsername
    }
}