package br.com.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.bottomappbar.BottomAppBar


class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)


        val nomeDigitado = intent.getStringExtra("NOME_DIGITADO")
        val tvResultado = findViewById<TextView>(R.id.tbResultado)

        val nameText = nomeDigitado.toString()

        if (nameText.isNotBlank()) {
            tvResultado.text = "Olá... " + nomeDigitado + " ;D"
        } else {
            tvResultado.text = " :( volte e diga seu seu nome  "
        }

        //BOTAO VOLTAR
        val btVoltar = findViewById<Button>(R.id.btVoltar)
        btVoltar.setOnClickListener {
            finish()
        }


    }
}