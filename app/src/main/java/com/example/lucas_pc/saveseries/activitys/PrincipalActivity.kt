package com.example.lucas_pc.saveseries.activitys

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.lucas_pc.saveseries.R
import com.example.lucas_pc.saveseries.fragments.ItemFragment
import com.example.lucas_pc.saveseries.util.ListaDeSeries

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        supportFragmentManager
                .beginTransaction()
                .add(R.id.conteiner, ItemFragment.newInstance(ListaDeSeries.LISTA), "ItemFragment")
                .commit()

    }
}
