package com.example.mobileevaluasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Suhu : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suhu)

        edtNilaiSuhu = findViewById(R.id.edt_nilaisuhu)
        btnHitungSuhu = findViewById(R.id.btn_hitungsuhu)
        iHasilSuhu = findViewById(R.id.hasilsuhu)
        jHasilSuhuFa = findViewById(R.id.hasilsuhufa)
        kHasilSuhuCe = findViewById(R.id.hasilsuhuce)

        btnHitungSuhu.setOnClickListener(this)
    }
    private lateinit var edtNilaiSuhu: EditText
    private lateinit var btnHitungSuhu:Button
    private lateinit var iHasilSuhu: TextView
    private lateinit var jHasilSuhuFa: TextView
    private lateinit var kHasilSuhuCe: TextView
    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_hitungsuhu){
            val inputSuhu = edtNilaiSuhu.text.toString().trim()
            var isEmptyFields = false
            if (inputSuhu.isEmpty()) {
                isEmptyFields = true
                edtNilaiSuhu.error = "Field ini tidak tersedia"
            }

            if (!isEmptyFields) {
                val fahrenheit = (9 * inputSuhu.toDouble() /5) + 32
                val reamur = 4 * inputSuhu.toDouble() / 5
                val kelvin = inputSuhu.toDouble() + 273

                iHasilSuhu.text = (fahrenheit.toString()+" " + "Fahrenheit")
                jHasilSuhuFa.text =(reamur.toString()+" " + "Reamur")
                kHasilSuhuCe.text = (kelvin.toString()+" " + "Kelvin")

            }
        }
    }
}