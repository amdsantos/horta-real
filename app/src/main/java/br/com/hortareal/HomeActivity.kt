package br.com.hortareal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.widget.Toolbar

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val btnRegister = findViewById<ImageButton>(R.id.btn_register)
        btnRegister.setOnClickListener {
            val i = Intent(this, RegisterActivity::class.java)
            startActivity(i)
        }

        val cardInfo = findViewById<ImageButton>(R.id.card)
        cardInfo.setOnClickListener {
            val i = Intent(this, InfoActivity::class.java)
            startActivity(i)
        }



    }
}

