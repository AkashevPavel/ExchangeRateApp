package com.akashev_pavel.exchange_rate_app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.akashev_pavel.exchange_rate_app.databinding.FragmentRatesTabBinding

class CurrencyPageFragment: Fragment() {

    private var _binding: FragmentRatesTabBinding? = null
    private val binding get () = _binding!!

    private val fragmentType: CurrencyType by lazy {
        CurrencyType.valueOf(requireArguments().getString(FRAGMENT_TYPE)!!)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRatesTabBinding.inflate(inflater)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = binding.recyclerView
    }

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