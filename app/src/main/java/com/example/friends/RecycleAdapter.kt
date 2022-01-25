package com.example.friends

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.items.view.*

class RecycleAdapter: RecyclerView.Adapter<RecycleAdapter.ViewHolder?>() {

    private var mUsers: List<Constant> = ArrayList()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleAdapter.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.items,
            parent,false)
        return RecycleAdapter.ViewHolder(view)    }


    override fun onBindViewHolder(holder: RecycleAdapter.ViewHolder, position: Int) {

        when(holder) {

            is ViewHolder -> {
                holder.bind(mUsers.get(position))

            }

        }
    }


    override fun getItemCount(): Int {
        return mUsers.size
    }
    fun submitList(constant:  List<Constant>){
        mUsers = constant
    }

    class ViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val item = itemView.item
        val nb = itemView.text_id

        fun bind(constant: Constant){

            item.setText(constant.question)
            nb.setText(constant.id)

        }

    }
}