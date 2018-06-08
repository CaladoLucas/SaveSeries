package com.example.lucas_pc.saveseries.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lucas_pc.saveseries.R
import kotlinx.android.synthetic.main.fragment_itens.*


class ItensFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_itens, container, false)
    }


}
