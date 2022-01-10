package com.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import com.example.menus.databinding.ActivityEj02OptionsMenuBinding

//https://developer.android.com/training/appbar/actions


class Ej02OptionsMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj02OptionsMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj02OptionsMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    /** Método que se lanza cuando se crea el menú de la activity */
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        //menuInflater.inflate(R.menu.menu1, menu)
        menuInflater.inflate(R.menu.menu2, menu)
        return true
    }

    /** Método que se lanza cuando se pulsa alguna opción del menú */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.new_game -> {
                Toast.makeText(this, "Opción: " + item.title, Toast.LENGTH_SHORT).show()
                true
            }
            R.id.help -> {
                Toast.makeText(this, "Pulsado ayuda", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}