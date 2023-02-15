package com.example.banksephora.uswa.shared.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.banksephora.R
import com.example.banksephora.databinding.ItemheaderLoginonboardUswaBinding

class HeaderView_LoginOnboard_uswa : ConstraintLayout {
    private lateinit var mContext: Context
    private lateinit var binding: ItemheaderLoginonboardUswaBinding

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

        binding = ItemheaderLoginonboardUswaBinding.bind(LayoutInflater.from(mContext).inflate(R.layout.itemheader_loginonboard_uswa, this, true))
    }

    fun setTitle(title: String) {
        binding.textView.text = title
    }
}