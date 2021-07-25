package com.example.atividade1

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.atividade1.R

class MainActivity : AppCompatActivity() {
    private lateinit var info: TextView
    private lateinit var btnNovo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.info = findViewById(R.id.tvMensagem2)
        this.btnNovo = findViewById(R.id.btnNova)

        this.btnNovo.setOnClickListener({modelo(it)})
    }

    fun modelo(view: View){
        this.info.text = Build.MODEL
    }
}