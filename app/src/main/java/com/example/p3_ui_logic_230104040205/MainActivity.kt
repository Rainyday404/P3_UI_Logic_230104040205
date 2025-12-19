package com.example.p3_ui_logic_230104040205 // Sesuaikan dengan package name kamu

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Binding Komponen (Menghubungkan variabel dengan ID di XML)
        val edtName = findViewById<EditText>(R.id.edtName)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        // 2. Event Listener (Aksi saat tombol diklik)
        btnSubmit.setOnClickListener {
            // Ambil teks dari EditText dan hapus spasi berlebih
            val name = edtName.text.toString().trim()

            // 3. Validasi Input
            if (name.isEmpty()) {
                edtName.error = "Nama tidak boleh kosong!" // Tampilkan error di input
                edtName.requestFocus() // Arahkan kursor ke input
                return@setOnClickListener
            }

            // 4. Tampilkan Output
            txtResult.text = "Halo, $name! Selamat datang di Praktikum 3"

            // Tampilkan Toast (Notifikasi singkat)
            Toast.makeText(this, "Input diterima", Toast.LENGTH_SHORT).show()
        }
    }
}