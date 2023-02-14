package com.example.banksephora.uswa.shared.ui

import android.content.Context
import android.text.Editable
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.banksephora.R
import com.example.banksephora.databinding.ItemInputformUswaBinding
import com.example.banksephora.databinding.ItemheaderLoginonboardUswaBinding

class HeaderForm : ConstraintLayout {
    private lateinit var mContext: Context
    private lateinit var binding: ItemInputformUswaBinding

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

        binding = ItemInputformUswaBinding.bind(LayoutInflater.from(mContext).inflate(R.layout.item_inputform_uswa , this, true))
    }

    fun setUsername() {
        binding.idedit.setText("Username")
        binding.idimage.setVisibility(GONE);
    }

    fun setPassword() {
        binding.idedit.setText("Password")
        binding.idimage.setVisibility(VISIBLE);
    }
}