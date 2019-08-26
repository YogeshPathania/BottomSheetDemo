package com.example.bottomsheetdemo

import android.app.Application
import androidx.lifecycle.MutableLiveData

class BottomRepository(var application: Application) {


    val data = MutableLiveData<List<Model>>()

    init {
        data.value = DummyData()
    }

    private fun DummyData(): ArrayList<Model>{

        val model = ArrayList<Model>()
        var data = Model()
        data.name = "Yogesh"
        model.add(data)

        data = Model()
        data.name = "Yogesh"
        model.add(data)


        data = Model()
        data.name = "Yogesh"
        model.add(data)

        data = Model()
        data.name = "Yogesh"
        model.add(data)


        data = Model()
        data.name = "Yogesh"
        model.add(data)

        data = Model()
        data.name = "Yogesh"
        model.add(data)

        data = Model()
        data.name = "Yogesh"
        model.add(data)

        data = Model()
        data.name = "Yogesh"
        model.add(data)
        data = Model()
        data.name = "Yogesh"
        model.add(data)

        data = Model()
        data.name = "Yogesh"
        model.add(data)
        data = Model()
        data.name = "Yogesh"
        model.add(data)

        data = Model()
        data.name = "Yogesh"
        model.add(data)
        data = Model()
        data.name = "Yogesh"
        model.add(data)

        data = Model()
        data.name = "Yogesh"
        model.add(data)
        data = Model()
        data.name = "Yogesh"
        model.add(data)

        data = Model()
        data.name = "Yogesh"
        model.add(data)
        data = Model()
        data.name = "Yogesh"
        model.add(data)

        data = Model()
        data.name = "Yogesh"
        model.add(data)
        data = Model()
        data.name = "Yogesh"
        model.add(data)

        data = Model()
        data.name = "Yogesh"
        model.add(data)

        return model
    }

    fun setdata(): MutableLiveData<List<Model>> {

        return data

    }


}
