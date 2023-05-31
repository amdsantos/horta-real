package br.com.hortareal

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class LoadingPage : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading_page)

        val mainLayout: View = window.decorView.findViewById(android.R.id.content)
        mainLayout.setOnTouchListener { v, event ->
            val intent = Intent(this@LoadingPage, MainActivity::class.java)
            startActivity(intent)
            false
        }


    }
}