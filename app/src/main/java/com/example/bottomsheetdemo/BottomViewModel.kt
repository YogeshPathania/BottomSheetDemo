package com.example.bottomsheetdemo

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class BottomViewModel(application: Application):AndroidViewModel(application) {

    val mrepo=BottomRepository(application)


    fun setdata(): MutableLiveData<List<Model>> {

        return mrepo.setdata()

    }
}
