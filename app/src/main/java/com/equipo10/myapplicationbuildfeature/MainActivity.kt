package com.equipo10.myapplicationbuildfeature

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.equipo10.myapplicationbuildfeature.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  ColorModels : MutableList<ColorModel>
    private lateinit var binding: ActivityMainBinding // Definimos `binding` como una propiedad lateinit
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configura DataBinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main) // Inicializamos aquí
        binding.mainActivity = this // Vincula la actividad con el layout
        }

    fun setupColorModels() {
        var imageView: ImageView
        var ColorNames = binding.root.context.resources.getStringArray(R.array.strings_colors)
    }

    fun onSendClick() {
        val text = binding.editText.text.toString()

        // Inicia la segunda actividad pasando el texto
        val intent = Intent(this, SecondActivity::class.java).apply {
            putExtra("TEXT_KEY", text)
        }
        startActivity(intent)
    }

    fun onSendClickRecycle()
    {
        val intent = Intent(this,RecycleViewActivity::class.java).apply{
        }
        startActivity(intent)    }

}