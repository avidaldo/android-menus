package com.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.menus.databinding.ActivityEj07NavigationDrawerBinding
import com.google.android.material.snackbar.Snackbar


/*
https://www.youtube.com/watch?v=l-jdSOUpSIA
https://www.youtube.com/watch?v=KBo1pyugG88
https://developer.android.com/guide/navigation/navigation-ui#add_a_navigation_drawer
 */

class Ej07NavigationDrawerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj07NavigationDrawerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj07NavigationDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.contentMain.toolbar)

        // Para añadir el icono del NavigationMenu a la toolbar
        val toggle = ActionBarDrawerToggle(
            this, binding.root, binding.contentMain.toolbar,
            R.string.open,
            R.string.close
        )

        binding.root.addDrawerListener(toggle)
        toggle.syncState() // Añade a la toolbar el icono para mostrar el Drawer

        binding.navMenu.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> cambio(R.string.home)
                R.id.about -> cambio(R.string.about)
                R.id.contact -> cambio(R.string.contact)
                R.id.rating -> cambio(R.string.rating)
            }
            true
        }

        binding.contentMain.button.setOnClickListener {
            Toast.makeText(this, supportActionBar!!.title, Toast.LENGTH_SHORT).show()
        }


    }

    private fun cambio(s: String) {
        binding.root.closeDrawer(GravityCompat.START)  // Para cerrar el Drawer cuando se selecciona un item
        Snackbar.make(binding.navMenu, s, Snackbar.LENGTH_SHORT).show()
        supportActionBar!!.title = s
    }

    private fun cambio(id: Int) {
        cambio(getString(id))
    }

}