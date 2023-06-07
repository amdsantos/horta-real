package br.com.hortareal

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.HandlerCompat


class LoadingPage : AppCompatActivity() {
    private val splashTimeOut: Long = 3000 // Tempo de exibição da Splash screen (em milissegundos)
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading_page)

            // Agendar uma transição para a próxima tela após o tempo de exibição da Splash screen
        val handler = HandlerCompat.createAsync(mainLooper)
        handler.postDelayed({
            val intent = Intent(this, HomeActivity::class.java) // Substitua MainActivity pela sua próxima tela
            startActivity(intent)
            finish()
        }, splashTimeOut)
        }
    }


