package br.com.hortareal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val groupSpinner: Spinner = findViewById(R.id.spinner1)
        val group = arrayOf("Escolha um grupo", "Opção 1", "Opção 2", "Opção 3")

        val adapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, group)
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        groupSpinner.adapter = adapter1

        val itemSpinner: Spinner = findViewById(R.id.spinner2)
        val item = arrayOf("Escolha o item", "Opção 1", "Opção 2", "Opção 3")

        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        itemSpinner.adapter = adapter2

        val sensorSpinner: Spinner = findViewById(R.id.spinner3)
        val sensor = arrayOf("Escolha ao menos um item", "Opção 1", "Opção 2", "Opção 3")

        val adapter3 = ArrayAdapter(this, android.R.layout.simple_spinner_item, sensor)
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        sensorSpinner.adapter = adapter3

    }

}