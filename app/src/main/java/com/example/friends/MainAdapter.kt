package com.example.friends

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.items.view.*

class MainAdapter {

    private var mUsers: List<Constant> = ArrayList()


    fun submitList(constant:  List<Constant>){
        mUsers = constant
    }

    class ViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val item = itemView.et_txt
        val nb = itemView.textView

        fun bind(constant: Constant){

            item.setText(constant.question)
            nb.setText(constant.id)

        }

    }
}