package com.akashev_pavel.exchange_rate_app.ui.utils

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

open class BindingViewHolder<VB : ViewBinding>(val viewBinding: VB) :
    RecyclerView.ViewHolder(viewBinding.root)