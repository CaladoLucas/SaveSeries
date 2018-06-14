package com.example.lucas_pc.saveseries.fragments

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.lucas_pc.saveseries.R
import com.example.lucas_pc.saveseries.activitys.DetailActivity
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

//            Toast.makeText(v.context, "tt", Toast.LENGTH_SHORT).show()
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



//        holder.itemView.setOnClickListener{
//            var intent = Intent(it.context,DetailActivity::class.java)
//            intent.putExtra("item_nome", item.nome)
//            intent.putExtra("item_descricao", item.descricao)
//
//            it.context.startActivity(intent)
//
//        }
        holder.cardView.setOnClickListener{
            var intent = Intent(it.context,DetailActivity::class.java)
            intent.putExtra("item_nome", item.nome)
            intent.putExtra("item_descricao", item.descricao)

            it.context.startActivity(intent)
        }




        with(holder.mView) {
            tag = item
            setOnClickListener(mOnClickListener)
        }
    }



    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val item_nome: TextView = mView.item_nome
        val cardView: CardView = mView.cardView
        //val mContentView: TextView = mView.item_nome

        /*override fun toString(): String {
            return super.toString() + " '" + mContentView.text + "'"
        }*/
    }
}
