package com.example.project_unknown

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {
    private lateinit var userone: EditText
    private lateinit var passone: EditText
    private lateinit var regisbutton: Button
    private lateinit var checkbox: CheckBox
    private lateinit var dbhelper: DBHelper
    private lateinit var imageback : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        userone = findViewById(R.id.ed_rg_mail)
        passone = findViewById(R.id.ed_rg_pw)
        checkbox = findViewById(R.id.cb_rg_robot)
        regisbutton = findViewById(R.id.bn_rg)
        imageback = findViewById(R.id.iv_back)
        dbhelper = DBHelper(this)

        imageback.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        regisbutton.setOnClickListener {
            val username = userone.text.toString()
            val password = passone.text.toString()
            val isChecked = checkbox.isChecked

            if (username.isEmpty() || password.isEmpty() || !isChecked) {
                Toast.makeText(this, "Please fill in all the fields and check the 'I'm not a robot' checkbox", Toast.LENGTH_SHORT).show()
            } else {
                val savedata = dbhelper.insertData(username, password)
                if (savedata) {
                    Toast.makeText(this, "Sign up successful", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)

                } else {
                    Toast.makeText(this, "Registration failed", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}

