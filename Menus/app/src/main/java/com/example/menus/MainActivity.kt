package com.example.menus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menus.databinding.ActivityMainBinding

// https://developer.android.com/guide/topics/ui/menus


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEj1.setOnClickListener {
            startActivity(Intent(this, Ej01OptionsMenuActivity::class.java))
        }
        binding.btnEj2.setOnClickListener {
            startActivity(Intent(this, Ej02OptionsMenuActivity::class.java))
        }
        binding.btnEj3.setOnClickListener {
            startActivity(Intent(this, Ej03AtrasActivity::class.java))
        }
        binding.btnEj4.setOnClickListener {
            startActivity(Intent(this, Ej04ContextMenuActivity::class.java))
        }
        binding.btnEj5.setOnClickListener {
            startActivity(Intent(this, Ej05ToolbarActivity::class.java))
        }
        binding.btnEj6.setOnClickListener {
            startActivity(Intent(this, Ej06NavigationDrawerActivity::class.java))
        }


    }


}