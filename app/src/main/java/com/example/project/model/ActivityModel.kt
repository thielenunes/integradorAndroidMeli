package com.example.project.model

import android.media.Image
import androidx.annotation.DrawableRes

data class ActivityModel(
    val id: Int,
    @DrawableRes
    val image: Int,
    val activity: String,
    val title: String,
    val price: String
)