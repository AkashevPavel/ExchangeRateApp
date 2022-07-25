package com.akashev_pavel.exchange_rate_app

import android.os.Bundle
import androidx.fragment.app.Fragment

class CurrencyPageFragment: Fragment() {

    companion object {
        private const val FRAGMENT_TYPE = "FRAGMENT_TYPE"

        fun newInstance(fragmentType: CurrencyType): CurrencyPageFragment {
            return CurrencyPageFragment().apply {
                arguments = Bundle().also {
                    it.putString(FRAGMENT_TYPE, fragmentType.toString())
                }
            }
        }
    }
}