package com.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import com.example.menus.databinding.ActivityEj042ContextBinding



class Ej042ContextActivity : AppCompatActivity() {

    private lateinit var vistaActual: View

    private lateinit var binding: ActivityEj042ContextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj042ContextBinding.inflate(layoutInflater)
        setContentView(binding.root)

        registerForContextMenu(binding.btnArriba)
        registerForContextMenu(binding.btnAbajo)

    }

    override fun onCreateContextMenu(menu: ContextMenu, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)

        vistaActual = v!!

        menuInflater.inflate(R.menu.menu_simple, menu)
        menu.setHeaderTitle("Título del menú")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.remove -> {
                vistaActual.visibility = View.INVISIBLE
            }
        }
        return super.onContextItemSelected(item)
    }


}