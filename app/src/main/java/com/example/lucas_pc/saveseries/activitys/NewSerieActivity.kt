package com.example.lucas_pc.saveseries.activitys

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.lucas_pc.saveseries.R
import com.example.lucas_pc.saveseries.models.Serie
import com.example.lucas_pc.saveseries.util.ListaDeSeries
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_new_serie.*

class NewSerieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_serie)

        btInserir.setOnClickListener {
            if (edtName.text != null && edtDescricao.text != null) {

                val list = ListaDeSeries.LISTA.add(Serie(edtName.text.toString(), edtDescricao.text.toString()))

                if(intent.extras == null){

                    Log.d("IF","to no normal")
                    val intent = Intent(this, PrincipalActivity::class.java)
                    intent.putExtra("lista", list)
                    intent.putExtra("Nome",edtName.text.toString())
                    startActivity(intent)
                }else{
                    Log.d("IF","to no result")
                    val resultIntent = Intent()
                    resultIntent.putExtra("lista", list)
                    resultIntent.putExtra("Nome",edtName.text.toString())
                    setResult(Intent.FILL_IN_ACTION,resultIntent)
                    finish()
                }



            }
        }
    }
}

