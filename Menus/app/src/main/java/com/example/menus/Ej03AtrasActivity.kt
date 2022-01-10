package com.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.menus.databinding.ActivityEj03AtrasBinding

class Ej03AtrasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj03AtrasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj03AtrasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onBackPressed()
        //NavUtils.navigateUpFromSameTask(this)
        return true
    }

}