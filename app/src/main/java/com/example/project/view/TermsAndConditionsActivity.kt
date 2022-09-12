package com.example.project.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project.databinding.ActivityTermsAndConditionsBinding

class TermsAndConditionsActivity : AppCompatActivity() {
    lateinit var binding: ActivityTermsAndConditionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTermsAndConditionsBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.imgClose.setOnClickListener {
            finish()
        }
    }
}