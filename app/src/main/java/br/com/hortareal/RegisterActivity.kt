package br.com.hortareal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.Spinner

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnHome = findViewById<ImageButton>(R.id.btn_home)

        btnHome.setOnClickListener {
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)

        }


        //Spinner Groups
        val groupSpinner: Spinner = findViewById(R.id.spinner1)
        val groups = arrayOf("Escolha um Grupo", "Frutos", "Herbáceas", "Tuberosas")


        val adapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, groups)
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        groupSpinner.adapter = adapter1


        groupSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedGroup = parent.getItemAtPosition(position) as String
                when (selectedGroup) {
                    "Frutos" -> {
                        val frutosArray = arrayOf("Frutos",
                             "Abóbora",
                             "Berinjela",
                             "Chuchu",
                             "Ervilha",
                             "Jiló",
                             "Melancia",
                             "Pimentão",
                             "Quiabo",
                             "Tomate"
                        )
                        val itemSpinner: Spinner = findViewById(R.id.spinner2)
                        val adapter2 = ArrayAdapter(this@RegisterActivity, android.R.layout.simple_spinner_item, frutosArray)
                        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                        itemSpinner.adapter = adapter2
                    }
                    "Herbáceas" -> {
                        val herbaceasArray = arrayOf("Herbáceas",
                             "Acelga",
                             "Aipo",
                             "Alcachofra",
                             "Alface",
                             "Almeirão",
                             "Aspargo",
                             "Brócolis",
                             "Couve-flor",
                             "Espinafre",
                             "Repolho",
                             "Taioba"
                        )
                        val itemSpinner: Spinner = findViewById(R.id.spinner2)
                        val adapter2 = ArrayAdapter(this@RegisterActivity, android.R.layout.simple_spinner_item, herbaceasArray)
                        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                        itemSpinner.adapter = adapter2
                    }
                    "Tuberosas" -> {
                        val tuberosasArray = arrayOf("Tuberosas",
                             "Alho",
                             "Alho-poró",
                             "Batata",
                             "Batata-doce",
                             "Beterraba",
                             "Cará",
                             "Cebola",
                             "Cenoura",
                             "Inhame",
                             "Mandioca",
                             "Nabo",
                             "Rabanete"
                        )
                        val itemSpinner: Spinner = findViewById(R.id.spinner2)
                        val adapter2 = ArrayAdapter(this@RegisterActivity, android.R.layout.simple_spinner_item, tuberosasArray)
                        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                        itemSpinner.adapter = adapter2
                    }
                }

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Não é necessário implementar nada aqui
            }
        }


        //Spinner Sensores
        val sensorSpinner: Spinner = findViewById(R.id.spinner3)
        val sensor = arrayOf("Escolha ao menos um sensor",
            "Umidade do solo (5cm)",
            "Umidade do solo (20cm)",
            "Umidade do ar",
            "Temperatura do ar",
            "Luminosidade"
        )

        val adapter3 = ArrayAdapter(this, android.R.layout.simple_spinner_item, sensor)
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        sensorSpinner.adapter = adapter3


    }




    }
