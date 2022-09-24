package com.gabriel.augusto.netflox

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.gabriel.augusto.netflox.databinding.ActivityInicialBinding

class ActivityInicial : AppCompatActivity() {

    private lateinit var binding: ActivityInicialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityInicialBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}