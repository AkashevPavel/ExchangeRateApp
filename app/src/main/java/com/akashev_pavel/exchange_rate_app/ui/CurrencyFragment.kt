package com.akashev_pavel.exchange_rate_app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.akashev_pavel.exchange_rate_app.R
import com.akashev_pavel.exchange_rate_app.ui.CurrencyType.FAVOURITE
import com.akashev_pavel.exchange_rate_app.ui.CurrencyType.POPULAR
import com.akashev_pavel.exchange_rate_app.databinding.FragmentCurrencyBinding
import com.akashev_pavel.exchange_rate_app.ui.adapters.CurrencyPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator


class CurrencyFragment : Fragment() {

    private var _binding: FragmentCurrencyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCurrencyBinding.inflate(inflater)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureViewPager()
    }

    private fun configureViewPager() {
        with(binding) {
            pager.adapter = CurrencyPagerAdapter(this@CurrencyFragment)
            TabLayoutMediator(tabLayout, pager) { tab, position ->
                tab.text =
                    if (position == 0) getString(R.string.popular) else getString(R.string.favourite)
            }.attach()
        }

    }
}