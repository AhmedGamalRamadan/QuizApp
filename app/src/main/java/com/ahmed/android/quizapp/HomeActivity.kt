package com.ahmed.android.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahmed.android.quizapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var activityHomeBinding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)
        activityHomeBinding.playQuizHomeBtn.setOnClickListener {
            val intent = Intent(this@HomeActivity, PlayActivity::class.java)
            startActivity(intent)
        }
    }
}