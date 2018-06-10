package com.example.lucas_pc.saveseries.activitys

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.lucas_pc.saveseries.R
import com.example.lucas_pc.saveseries.models.Serie
import com.example.lucas_pc.saveseries.util.ListaDeSeries
import kotlinx.android.synthetic.main.activity_new_serie.*

class NewSerieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_serie)

        btInserir.setOnClickListener {
            if (edtName.text != null && edtDescricao.text != null) {

                val list = ListaDeSeries.LISTA.add(Serie(edtName.text.toString(), edtDescricao.text.toString()))

                val intent = Intent(this, PrincipalActivity::class.java)
                intent.putExtra("lista", list)
                startActivity(intent)
            }
        }
    }
}

