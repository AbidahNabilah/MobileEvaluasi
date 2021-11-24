package com.example.mobileevaluasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Rupiah : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rupiah)

        edtNilaiRupiah = findViewById(R.id.edt_nilairupiah)
        btnHitung = findViewById(R.id.btn_hitung)
        eHasil = findViewById(R.id.hasil)

        btnHitung.setOnClickListener(this)

    }

    private lateinit var edtNilaiRupiah: EditText
    private lateinit var btnHitung: Button
    private lateinit var eHasil: TextView

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_hitung){
            val inputRupiah = edtNilaiRupiah.text.toString().trim()

            var isEmptyFields = false
            if (inputRupiah.isEmpty()) {
                isEmptyFields = true
                edtNilaiRupiah.error = "Field ini tidak tersedia"
            }

            if (!isEmptyFields) {
                val akhir = inputRupiah.toInt() / 15000
                eHasil.text = ("$"+akhir.toString())

            }
        }
    }
}








