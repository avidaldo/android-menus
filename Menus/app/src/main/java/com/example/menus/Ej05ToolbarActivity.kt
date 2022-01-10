package com.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.menus.databinding.ActivityEj05ToolbarBinding


/** https://developer.android.com/training/appbar/setting-up
 * La ActionBar es la barra de título que se crea por defecto en todas las activities. Al írsele
 * añadiendo nuevas características, su comportamiento varía en cada versión de Android. Se recomienda
 * actualmente eliminarla utilizando uno de los themes "NoActionBar" de appcompat, en lugar de los
 * que tiene AppCompatActivity por defecto.
 *
 * En sustitución, se debe usar Toolbar, que es una vista que se puede posicionar como cualquier otra
 * en el lugar que queramos del layout
 *
 */



class Ej05ToolbarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj05ToolbarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj05ToolbarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)  /* Al utilizar toolbar tenemos que asignar
        qué toolbar se utiliza como ActionBar. */

        supportActionBar!!.title = "Título"
        binding.toolbar.subtitle = "Subtítulo"


    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        return true
    }

}