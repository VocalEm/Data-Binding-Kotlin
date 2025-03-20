package com.equipo10.myapplicationbuildfeature

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.equipo10.myapplicationbuildfeature.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configura DataBinding
        val binding: ActivitySecondBinding = DataBindingUtil.setContentView(this, R.layout.activity_second)

        // Recibe el texto enviado desde MainActivity
        val receivedText = intent.getStringExtra("TEXT_KEY")
        binding.textView.text = receivedText
    }
}
