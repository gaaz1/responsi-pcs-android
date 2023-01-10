package com.responsi.pcs

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    private lateinit var btnLogin : Button
    private lateinit var btnForgetPass : TextView
    private lateinit var btnRegister : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin= findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener{
            val intentLogin = Intent(this,HomeActivity::class.java)
            startActivity(intentLogin)
        }

        btnForgetPass = findViewById(R.id.txtForgotPass)
        btnLogin.setOnClickListener{
            val intentForgetPass = Intent(this,RecoveryActivity::class.java)
            startActivity(intentForgetPass)
        }

        btnRegister = findViewById(R.id.txtRegister)
        btnRegister.setOnClickListener {
            val intentReg = Intent(this,RegisterActivity::class.java)
            startActivity(intentReg)
        }

    }
}