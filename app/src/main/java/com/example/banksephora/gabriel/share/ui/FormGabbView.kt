package com.example.banksephora.gabriel.share.ui

import android.content.Context
import android.text.InputType
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.banksephora.R
import com.example.banksephora.databinding.FormViewGabbBinding

class FormGabbView: ConstraintLayout {
    private lateinit var binding: FormViewGabbBinding
    private lateinit var mContext: Context

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
    fun setHint1 (hint: String){
        binding.ketikUsername.hint = hint
//        binding.ketikUsername.setInputType(InputType.TYPE_CLASS_TEXT)
    }
    fun setHint2 (hint: String){
        binding.ketikUsername.hint = hint
    }
}