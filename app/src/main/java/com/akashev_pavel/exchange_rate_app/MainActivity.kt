package com.akashev_pavel.exchange_rate_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akashev_pavel.exchange_rate_app.databinding.ActivityMainBinding

class CurrencyActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}