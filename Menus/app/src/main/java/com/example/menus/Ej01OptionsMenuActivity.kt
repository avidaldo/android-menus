package com.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.menus.databinding.ActivityEj01OptionsMenuBinding

class Ej01OptionsMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj01OptionsMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj01OptionsMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.title = "Título"
        supportActionBar!!.subtitle = "Subtítulo"

    }

    /** Método que se lanza cuando se crea el menú en la ActionBar */
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        // Se define el fichero de recursos res/menu/menu1.xml
        menuInflater.inflate(R.menu.menu1clase, menu) // se pueden cargar dos menus
        return true
    }

}