package com.example.project_unknown

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class inputinformation :AppCompatActivity(){

    private lateinit var favorite : EditText
    private lateinit var GPA : EditText
    private lateinit var faculty : EditText
    private lateinit var university : EditText
    private lateinit var btn : Button
    private lateinit var imageback : ImageView

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {   ///ส่งค่าจาก editext ไป process///
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_information)

        favorite = findViewById(R.id.ed_getFavorite)
        GPA = findViewById(R.id.ed_getGrade)
        faculty = findViewById(R.id.ed_getFaculty)
        university = findViewById(R.id.ed_getUniversity)
        btn = findViewById(R.id.button)
        imageback = findViewById(R.id.iv_back2)

        imageback.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btn.setOnClickListener {

            val intent = Intent(this,TableProcess::class.java)

            ///ส่งค่าไปหน้า table process////
            intent.putExtra("favorite",favorite!!.text.toString())
            intent.putExtra("GPA",GPA!!.text.toString())
            intent.putExtra("faculty",faculty!!.text.toString())
            intent.putExtra("University",university!!.text.toString())

            startActivity(intent)

        }

    }
}