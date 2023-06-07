package br.com.hortareal

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView


class InfoActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        webView = findViewById(R.id.web)

        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true // Ativar suporte a JavaScript
        webSettings.domStorageEnabled = true // Ativar armazenamento DOM

        webView.webChromeClient = WebChromeClient()

        webView.loadUrl("https://horta-real.vercel.app/informacoes/001/002")

    }

}