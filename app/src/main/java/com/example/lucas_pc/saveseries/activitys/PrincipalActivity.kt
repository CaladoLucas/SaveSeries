package com.example.lucas_pc.saveseries.activitys

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.lucas_pc.saveseries.R
import com.example.lucas_pc.saveseries.fragments.ItemFragment
import com.example.lucas_pc.saveseries.util.ListaDeSeries
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        supportFragmentManager
                .beginTransaction()
                .add(R.id.conteiner, ItemFragment.newInstance(ListaDeSeries.LISTA), "ItemFragment")
                .commit()


        floatingActionButton_nova_serie.setOnClickListener {
            startActivityForResult(Intent(this, NewSerieActivity::class.java), 2)
        }

    }
}
