package com.example.project.vm

import Network.ActivityList
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.project.model.ActivityModel

class MainViewModel : ViewModel() {
    private var _isValid: MutableLiveData<Boolean> = MutableLiveData()
    private val initialActivitiesList = ActivityList.getActivityList()
    private var _activities = MutableLiveData(initialActivitiesList)


    val isValid: LiveData<Boolean>
        get() = _isValid

    val activities: LiveData<List<ActivityModel>>
        get() = _activities

    fun start(participants: String ) {
        _isValid.value = participants != "0" && participants.isNotEmpty()
    }

    fun getActivityList(): LiveData<List<ActivityModel>> {
        return _activities
    }

    fun getActivityForId(id: Int): ActivityModel? {
        _activities.value?.let { activity ->
            return activity.firstOrNull{ it.id == id}
        }
        return null
    }

    fun getActivityForCategory(id: Int, category: String?): ActivityModel? {
        _activities.value?.let { activity ->
            return activity.find { it.activity == category && it.id != id}
        }
        return null
    }
}