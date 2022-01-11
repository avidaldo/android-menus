package com.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.menus.databinding.ActivityEj06AtrasMenuBinding

class Ej06AtrasMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj06AtrasMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj06AtrasMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


    }


    /** Método que se lanza cuando se crea el menú de la activity */
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu2, menu)
        return true
    }

    /** Método que se lanza cuando se pulsa alguna opción del menú */ // arreglar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.new_game -> {
                Toast.makeText(this, "Nuevo Juego", Toast.LENGTH_SHORT).show()
            }
            R.id.help -> {
                Toast.makeText(this, "Pulsado ayuda", Toast.LENGTH_SHORT).show()
            }
            android.R.id.home -> { // Referencia al icono de regreso, pudiendo modificar comportamiento
                super.onBackPressed()
                //finish()
            }
            else -> Toast.makeText(this, "Opción: " + item.title, Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }

}