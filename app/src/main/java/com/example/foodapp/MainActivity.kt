package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.foodapp.databinding.ActivityLoginBinding
import com.example.foodapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

//        val bottomnav = findViewById<BottomNavigationView>(R.id.bottom_nav)
//        val navController = Navigation.findNavController(this,R.id.host_fragment)
//
//        NavigationUI.setupWithNavController(bottomnav,navController)




    }
}