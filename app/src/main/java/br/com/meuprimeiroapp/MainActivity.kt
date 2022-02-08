package br.com.meuprimeiroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btEnviar = findViewById<Button>(R.id.btEnviar)
        var tvResultado = findViewById<TextView>(R.id.tvResultado)

        var etName = findViewById<EditText>(R.id.etName)

        btEnviar.setOnClickListener {
            val name = etName.text.toString()

            if (name.isNotBlank()) {
                tvResultado.text = "Olá... " + name + " ;D"
            } else {
                etName.error = "Digite seu nome primeiro"
            }
        }

        //****A nova tela****
        var btAbrirNovaT = findViewById<Button>(R.id.btAbrirNovaTela)

        btAbrirNovaT.setOnClickListener {
            //intent + registro:
            val intentAbrirNovaTela = Intent(this, ResultadoActivity::class.java)
            intentAbrirNovaTela.putExtra("NOME_DIGITADO", etName.text.toString())
            startActivity(intentAbrirNovaTela)

        }

        //***************** btMap
        var btMap = findViewById<Button>(R.id.btMap)
        btMap.setOnClickListener {
            val intentAbrirMapa = Intent(this, MapsActivity::class.java)
           startActivity(intentAbrirMapa)

        }

    }
}

