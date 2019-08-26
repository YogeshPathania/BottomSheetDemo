package com.example.bottomsheetdemo

import android.content.Intent
import androidx.databinding.DataBindingUtil
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bottomsheetdemo.bottomsheet.BottomSheetFragment
import com.example.bottomsheetdemo.databinding.ActivityMainBinding
import com.example.bottomsheetdemo.databinding.BottomSheetBinding

class MainActivity : AppCompatActivity() {

    lateinit var mbinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mbinding.imageView.setOnClickListener {

            val fragment = BottomSheet()
            fragment.show(supportFragmentManager, fragment.tag)


        }


    }
}

//.................bottom sheeet...........................//
class BottomSheet : BottomSheetFragment() {
    private lateinit var mvmodel: BottomViewModel
    private lateinit var mbinding: BottomSheetBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mbinding = BottomSheetBinding.inflate(LayoutInflater.from(context), container, false)
        mvmodel=ViewModelProviders.of(this)[BottomViewModel::class.java]
        return mbinding.root
        //in this only layout set


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //all other function  use is there
        mbinding.button.setOnClickListener {
            val intent = Intent(context, Main2Activity::class.java)
            startActivity(intent)

        }


        //set the data in the recycler
        val manager=LinearLayoutManager(context)
        //set the layout

        mbinding.recycler.layoutManager=manager
        //set the data
        mvmodel.setdata().observe(this, Observer {


            mbinding.recycler.adapter=BottomAdapter(context,it)




        })



    }


}
//step 1. add the dependency of material
//step 2. set the theme for the bottom sheet in styles
//step 3. create the seprate class that extends the bottomsheetFragments
//step 4. override the two function....
//1. get theme()
//2. onCreateDialog()

//step 5.set the code on click that we set the seprate class of bottom sheet and set the layout
//and set fragment support manager in class
// step 6. extend the : BottomSheetFragment() in the new class

// step 7. new classis created  overide the fragment two methods
// 1. on create
// 2. on view created

// step 8. now the bottom sheet is created set the click on the bottom sheet and  open the activity from the bottom  sheet

//step 9. set  the recycler view in the bottom sheet




