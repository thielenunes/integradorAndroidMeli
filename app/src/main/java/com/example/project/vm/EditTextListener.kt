package com.example.project.vm

import android.content.Intent
import android.text.Editable
import android.text.TextWatcher
import com.example.project.databinding.ActivityMainBinding
import com.example.project.view.ActivitiesListActivity
import com.example.project.view.CategoryDetailActivity

class EditTextListener(private val binding: ActivityMainBinding) : TextWatcher {
    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        val editText = binding.inputAppNumberOfParticipants.text.toString()
        val button = binding.buttonStart
        val state = editText != "" && editText != "0"
        button.isEnabled = state
    }

    override fun afterTextChanged(p0: Editable?) {}
}

