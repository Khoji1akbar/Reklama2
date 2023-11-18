package com.example.reklama2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.reklama2.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var list: ArrayList<User>
    private lateinit var adabter: Adabter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        loadDate()
        adabter = Adabter(list)
        binding.rv.adapter = adabter

    }

    private fun loadDate() {
        list = ArrayList()
        list.add(User(Color.BLUE))
        list.add(User(Color.GREEN))
        list.add(User(Color.YELLOW))
        list.add(User(Color.RED))
        list.add(User(Color.MAGENTA))
        list.add(User(Color.CYAN))

    }
}