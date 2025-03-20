package com.equipo10.myapplicationbuildfeature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.equipo10.myapplicationbuildfeature.databinding.ActivityRecycleviewBinding

class RecycleViewActivity : AppCompatActivity () {
    private lateinit var binding: ActivityRecycleviewBinding // Definimos `binding` como una propiedad lateinit
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configura DataBinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycleview) // Inicializamos aquí
        binding.recycleviewActivity= this // Vincula la actividad con el layout
    }
}