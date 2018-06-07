package com.example.lucas_pc.saveseries

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btNovaSerie = findViewById<Button>(R.id.btNovaSerie)

        var btListaDeSerie = findViewById<Button>(R.id.btListaDeSerie)


        btNovaSerie.setOnClickListener{

        }

        btListaDeSerie.setOnClickListener {
            var intent = Intent(this, PrincipalActivity::class.java)
            startActivity(intent)
        }

    }
}
