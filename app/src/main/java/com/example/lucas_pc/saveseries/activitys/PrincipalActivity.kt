package com.example.lucas_pc.saveseries.activitys

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
            val intent = Intent(this, NewSerieActivity::class.java)
            intent.putExtra("enviando","1")
            startActivityForResult(intent, Intent.FILL_IN_ACTION)
        }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(resultCode){
            Intent.FILL_IN_ACTION->{

                var serieSalvar = data!!.extras["Nome"].toString()


                Toast.makeText(this, "Serie Salva: $serieSalvar", Toast.LENGTH_LONG).show()

                supportFragmentManager
                        .beginTransaction()
                        .add(R.id.conteiner, ItemFragment.newInstance(ListaDeSeries.LISTA), "ItemFragment")
                        .commit()

            }
        }
    }
}
