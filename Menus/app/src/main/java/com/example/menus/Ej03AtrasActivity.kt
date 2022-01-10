package com.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.menus.databinding.ActivityEj03AtrasBinding


// https://developer.android.com/training/appbar/up-action


class Ej03AtrasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj03AtrasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj03AtrasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        /* Si indicamos la activity padre en el manifest, con esta línea creamos un
        botón de regreso en la toolbar */
        //supportActionBar?.setDisplayHomeAsUpEnabled(true)
        /* Realmente no es necesaria por ser la opción por defecto, la utilizaríamos con
        false si queremos ocultar el botón pese a haber indicado una activity padre  */

    }

    /* También valdría con este método */

/*    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onBackPressed()
        //NavUtils.navigateUpFromSameTask(this)
        return true
    }*/

}