package com.example.aula1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Questions : AppCompatActivity() {
    lateinit var btnBack : ImageView
    lateinit var btnTrue : Button
    lateinit var btnFalse: Button
    lateinit var btnQuestion : Button
    lateinit var txtScore : TextView

    var pergunta : Int = 0
    var contador : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)


        btnBack = findViewById(R.id.btnBack)
        btnTrue = findViewById(R.id.btnTrue)
        btnFalse = findViewById(R.id.btnFalse)
        btnQuestion = findViewById(R.id.btnQuestion)
        txtScore = findViewById(R.id.txtScore)

        btnBack.setOnClickListener{
            finish()
        }

        atualizarPergunta()

        btnTrue.setOnClickListener {
            verificarResposta(true)
        }

        btnFalse.setOnClickListener {
            verificarResposta(false)
        }



    }
    private fun atualizarPergunta() {
        if(pergunta == 0){
            btnQuestion.text = "O Jorel é o irmão mais velho da família?"
        }else if (pergunta == 1) {
            btnQuestion.text = "A dona Danuza, a professora de Jorel, é uma super-heroína nas horas vagas?"
        }else if (pergunta == 2) {
            btnQuestion.text = "A vovó Juju já participou de uma corrida de patinetes na série?"
        }
    }

    private fun verificarResposta(resposta: Boolean) {
        if (pergunta == 0 && !resposta) {
            contador++
        } else if (pergunta == 1 && resposta) {
            contador++
        }else if(pergunta == 2 && resposta){
            contador++
        }
        txtScore.text = contador.toString()

        if (pergunta <= 2) {
            pergunta++
            atualizarPergunta()
        }
        //        else {
//
//        }
    }

}