package com.example.lucas_pc.saveseries.fragments

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.lucas_pc.saveseries.R


//import com.example.lucas_pc.saveseries.fragments.ItemFragment.OnListFragmentInteractionListener
import com.example.lucas_pc.saveseries.fragments.dummy.DummyContent.DummyItem
import com.example.lucas_pc.saveseries.models.Serie

import kotlinx.android.synthetic.main.fragment_item.view.*

/**
 * [RecyclerView.Adapter] that can display a [DummyItem] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class MyItemRecyclerViewAdapter(
        private val mValues: List<Serie>
        /*private val mListener: OnListFragmentInteractionListener?*/)
    : RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder>() {

    private val mOnClickListener: View.OnClickListener

    init {
        mOnClickListener = View.OnClickListener { v ->

            //metodo de click da view

            Toast.makeText(v.context, "tt", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        holder.item_nome.text = item.nome
        //holder.mContentView.text = item.content

        with(holder.mView) {
            tag = item
            setOnClickListener(mOnClickListener)
        }
    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val item_nome: TextView = mView.item_nome
        //val mContentView: TextView = mView.item_nome

        /*override fun toString(): String {
            return super.toString() + " '" + mContentView.text + "'"
        }*/
    }
}
