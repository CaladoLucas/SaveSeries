package com.example.lucas_pc.saveseries.activitys

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.lucas_pc.saveseries.R
import com.example.lucas_pc.saveseries.fragments.ItemFragment
import com.example.lucas_pc.saveseries.models.Serie
import kotlinx.android.synthetic.main.fragment_item.*

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        var list : ArrayList<Serie> = intent.extras.getSerializable("lista") as ArrayList<Serie>
        //var list: ArrayList<Serie> = arrayListOf()
        list.add(Serie("lala", "tutu"))

        supportFragmentManager
                .beginTransaction()
                .add(R.id.conteiner, ItemFragment.newInstance(list), "ItemFragment")
                .commit()

    }
}
