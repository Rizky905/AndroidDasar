package com.example.androiddasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onPause() {
        super.onPause()
        //onPause adalah fungsi yang akan dipanggil ketika user menekan tombol home
    }

    override fun onResume() {
        super.onResume()
        // onResume adalah fungsi yang akan dipanggil ketika user akan meng-click kembali setelah
        // menekan tombol home
    }

    override fun onDestroy() {
        super.onDestroy()
        // onDestroy adalah fungsi yang akan dipanggil ketika user menekan tombol back
    }

}
