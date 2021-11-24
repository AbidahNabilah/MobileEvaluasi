package com.example.mobileevaluasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRupiah: Button = findViewById(R.id.btn_rupiah)
        btnRupiah.setOnClickListener(this)

        val btnSuhu: Button = findViewById(R.id.btn_suhu)
        btnSuhu.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_rupiah ->{
                val moveIntent = Intent(this@MainActivity, Rupiah::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_suhu ->{
                val moveIntent = Intent(this@MainActivity, Suhu::class.java)
                startActivity(moveIntent)
            }
        }
    }
}