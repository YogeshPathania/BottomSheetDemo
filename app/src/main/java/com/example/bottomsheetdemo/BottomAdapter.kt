package com.example.bottomsheetdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomsheetdemo.databinding.BottomAdapterBinding

class BottomAdapter(var context: Context?, var it: List<Model>) :
    RecyclerView.Adapter<BottomAdapter.Viewholder>() {
    private lateinit var mbinding: BottomAdapterBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        //get the view and set i the adapter
        mbinding = BottomAdapterBinding.inflate(LayoutInflater.from(context), parent, false)
        return Viewholder(mbinding)


    }

    override fun getItemCount(): Int {
        return it.size
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {

        var data = it[position]
        holder.bind(data)

    }


    class Viewholder(var mbinding: BottomAdapterBinding) : RecyclerView.ViewHolder(mbinding.root) {
        fun bind(data: Model) {

            mbinding.data=data
            mbinding.executePendingBindings()
        }


    }

}
