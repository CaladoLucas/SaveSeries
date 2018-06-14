package com.example.lucas_pc.saveseries.activitys

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.lucas_pc.saveseries.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        getIncomingIntent()
    }

    fun getIncomingIntent(){

        if(intent.hasExtra("item_nome") && intent.hasExtra("item_descricao")){

            val nomeItem = intent.getStringExtra("item_nome")
            val nomeDescricao= intent.getStringExtra("item_descricao")
            setItem(nomeItem,nomeDescricao)
        }
    }

    fun setItem(nomeItem: String,nomeDescricao: String){
        textName.text = nomeItem
        textDescricao.text = nomeDescricao
    }

}
