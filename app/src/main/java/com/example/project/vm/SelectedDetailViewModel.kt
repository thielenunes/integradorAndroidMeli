package com.example.project.vm

import androidx.lifecycle.ViewModel
import com.example.project.model.ActivityModel

class SelectedDetailViewModel(private val datasource: MainViewModel)  : ViewModel(){

    fun getActivityForId(id: Int) : ActivityModel? {
        return datasource.getActivityForId(id)
    }
}