package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.foodapp.databinding.ActivityIntroBinding
import com.example.foodapp.databinding.ActivityLoginBinding

class IntroActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val s = supportActionBar?.hide()

        android.os.Handler().postDelayed({
            val intent=Intent(this@IntroActivity, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        },3000)



//        binding.getstartedBtn.setOnClickListener{
//            startActivity(Intent(this, MainActivity::class.java))
//        }

    }

}