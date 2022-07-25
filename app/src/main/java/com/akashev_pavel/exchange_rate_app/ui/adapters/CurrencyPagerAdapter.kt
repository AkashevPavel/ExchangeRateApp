package com.akashev_pavel.exchange_rate_app.ui.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.akashev_pavel.exchange_rate_app.ui.CurrencyPageFragment
import com.akashev_pavel.exchange_rate_app.ui.CurrencyType

class CurrencyPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return CurrencyPageFragment.newInstance(
            fragmentType = if (position == 0) CurrencyType.POPULAR else CurrencyType.FAVOURITE
        )
    }
}