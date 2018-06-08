package com.example.lucas_pc.saveseries.activitys

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.lucas_pc.saveseries.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btNovaSerie = findViewById<Button>(R.id.btNovaSerie)

        val btListaDeSerie = findViewById<Button>(R.id.btListaDeSerie)

        btNovaSerie.setOnClickListener{
            startActivity(Intent(this, NewSerieActivity::class.java))
        }

        btListaDeSerie.setOnClickListener {
            startActivity(Intent(this, PrincipalActivity::class.java))
        }

    }
}
