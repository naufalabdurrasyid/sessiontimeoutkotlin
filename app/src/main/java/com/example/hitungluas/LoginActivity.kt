package com.example.hitungluas

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        button.setOnClickListener {

            val sharedPreferences = this.getSharedPreferences("tes preference", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()

            editor.putLong("LOGIN_TIME", (System.currentTimeMillis() / 1000))
            editor.putLong("EXPIRED_TIME", 120)
            editor.apply()

            val i = Intent(this, MainActivity :: class.java)

                this.startActivity(i)

        }
    }
}