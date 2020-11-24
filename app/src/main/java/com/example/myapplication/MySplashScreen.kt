package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MySplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_splash_screen)
    }
}