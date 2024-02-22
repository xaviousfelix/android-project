package com.example.project_unknown

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "Contract.db" // ตั้งชื่อฐานข้อมูลของคุณที่นี่
        private const val DATABASE_VERSION = 1 // เวอร์ชันฐานข้อมูล
        private const val TABLE_NAME = "user" // ตั้งชื่อตารางฐานข้อมูลของคุณที่นี่
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE $TABLE_NAME (username TEXT PRIMARY KEY, password TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
    }

    fun insertData(username: String, password: String): Boolean {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put("username", username)
        values.put("password", password)
        val result = db.insert(TABLE_NAME, null, values)
        db.close()
        return result != -1L
    }

    fun checkUser(username: String, password: String): Boolean {
        val db = readableDatabase
        val query = "SELECT * FROM $TABLE_NAME WHERE username = '$username' AND password = '$password'"
        val cursor = db.rawQuery(query, null)
        val isUserExists = cursor.count > 0
        cursor.close()
        return isUserExists
    }
}






