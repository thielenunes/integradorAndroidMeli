package com.example.project.vm

import android.content.Context

class Preferences(val context: Context) {
    val SHARED_KEY = "SHARED_KEY"
    val PARTICIPANTS_KEY = "PARTICIPANTS_KEY"

    private val storage = context.getSharedPreferences(SHARED_KEY, 0)

    fun saveParticipants(number: Int) {
        storage.edit().putInt(PARTICIPANTS_KEY, number).apply()
    }

    fun getParticipants(): Int {
        return storage.getInt(PARTICIPANTS_KEY, 0)
    }
}