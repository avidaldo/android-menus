package com.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.ContextMenu.ContextMenuInfo
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.menus.databinding.ActivityEj04ContextMenuBinding

class Ej04ContextMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj04ContextMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj04ContextMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tv4.setOnClickListener { clickNormal(it) }

        registerForContextMenu(binding.tv4)

    }

    fun clickNormal(view: View?) {
        Toast.makeText(this, "Tienes que mantener pulsado más tiempo", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateContextMenu(menu: ContextMenu, v: View?, menuInfo: ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menu1, menu)
        menu.setHeaderTitle("Título del menú")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item1, R.id.item2, R.id.item3 -> {
                Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            }
        }
        return super.onContextItemSelected(item)
    }

}