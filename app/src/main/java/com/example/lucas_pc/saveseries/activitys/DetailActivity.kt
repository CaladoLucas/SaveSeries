package com.example.lucas_pc.saveseries.activitys

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.lucas_pc.saveseries.R
import com.example.lucas_pc.saveseries.util.ListaDeSeries
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

var posicao: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        getIncomingIntent()

        btnExcluir.setOnClickListener{
            excluiItem(posicao)
            finish()
        }
    }

    fun getIncomingIntent(){

        if(intent.hasExtra("item_nome") && intent.hasExtra("item_descricao")){

            val posicao = intent.getIntExtra("posicao",0)
            val nomeItem = intent.getStringExtra("item_nome")
            val nomeDescricao= intent.getStringExtra("item_descricao")
            setItem(nomeItem,nomeDescricao,posicao)
        }
    }
    fun excluiItem(position: Int){

        ListaDeSeries.LISTA.removeAt(position)
    }

    fun setItem(nomeItem: String,nomeDescricao: String,posicao: Int){
        textName.text = nomeItem
        textDescricao.text = nomeDescricao
        this.posicao = posicao
        txtPosicao.text =  getString(R.string.posicao_do_item).plus(" ").plus(posicao)
    }

}
