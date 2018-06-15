package com.example.lucas_pc.saveseries.activitys

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.lucas_pc.saveseries.R
import com.example.lucas_pc.saveseries.util.ListaDeSeries
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        getIncomingIntent()



        btnVoltar.setOnClickListener{
            startActivity(Intent(this,PrincipalActivity::class.java))
        }

        btnExcluir.setOnClickListener{
            excluiItem(txtPosicao)
            startActivity(Intent(this,PrincipalActivity::class.java))
        }
    }

    fun getIncomingIntent(){

        if(intent.hasExtra("item_nome") && intent.hasExtra("item_descricao")){

            val item = intent.getStringExtra("item").toString()
            val nomeItem = intent.getStringExtra("item_nome")
            val nomeDescricao= intent.getStringExtra("item_descricao")
            setItem(nomeItem,nomeDescricao,item)
        }
    }
    fun excluiItem(position: Any){
        ListaDeSeries.LISTA.remove(position)
    }

    fun setItem(nomeItem: String,nomeDescricao: String,item: String){
        textName.text = nomeItem
        textDescricao.text = nomeDescricao
        txtPosicao.text = item
    }

}
