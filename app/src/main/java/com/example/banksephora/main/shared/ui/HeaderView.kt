package com.example.banksephora.main.shared.ui

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.banksephora.R
import com.example.banksephora.databinding.ItemHeaderBinding

class HeaderView : ConstraintLayout {

    private lateinit var mContext: Context
    private lateinit var binding: ItemHeaderBinding

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

        binding = ItemHeaderBinding.bind(LayoutInflater.from(mContext).inflate(R.layout.item_header, this, true))
    }

    fun setTitle(title: String) {
        binding.textView.text = title
    }

}