package com.example.project_unknown

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var dbhelper: DBHelper
    private lateinit var edur: EditText
    private lateinit var edpw: EditText
    private lateinit var btnsingin: Button
    private lateinit var btnsignup: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbhelper = DBHelper(this)
        edur = findViewById(R.id.ed_mail)
        edpw = findViewById(R.id.ed_pw)
        btnsingin = findViewById(R.id.btn_signin)
        btnsignup = findViewById(R.id.btn_signup)

        btnsingin.setOnClickListener {
            val username = edur.text.toString()
            val password = edpw.text.toString()

            if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
                Toast.makeText(this, "Add username and Password", Toast.LENGTH_SHORT).show()
            } else {
                val check = dbhelper.checkUser(username, password) // แก้ตรงนี้
                if (check) {
                    Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                    val nextpage = Intent(this, inputinformation::class.java)
                    startActivity(nextpage)
                } else {
                    Toast.makeText(this, "Wrong username & password", Toast.LENGTH_SHORT).show()
                }
            }
        }

        btnsignup.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}
