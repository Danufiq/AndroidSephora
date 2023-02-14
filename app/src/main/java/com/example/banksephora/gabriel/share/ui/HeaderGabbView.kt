package com.example.banksephora.gabriel.share.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.banksephora.R
import com.example.banksephora.databinding.HeaderGabbBinding

class HeaderGabbView: ConstraintLayout {
    private lateinit var binding: HeaderGabbBinding
    private lateinit var mContext: Context

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context, attrs )
    }

    private fun init(context: Context, attributeSet: AttributeSet?) {
        mContext = context
        binding = HeaderGabbBinding.bind(LayoutInflater.from(mContext).inflate(R.layout.header_gabb, this, true))
    }

    fun setTitle(title: String) {
        binding.textView.text = title
    }
}