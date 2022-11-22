package com.bignerdranch.android.kinopoisk

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class SignlnScreen : AppCompatActivity() {
    lateinit var login: EditText
    lateinit var password: EditText
    lateinit var sharedd: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signln_screen)
        login = findViewById(R.id.editText)
        password = findViewById(R.id.editText2)
        sharedd=getSharedPreferences("ACCOUNT_FILMS", MODE_PRIVATE)
        if(sharedd.contains("MY_LOGIN_FILM") && sharedd.contains("MY_PASSWORD_FILM")){
            var l = sharedd.getString("MY_LOGIN_FILM", "NONE")
            var p = sharedd.getString("MY_PASSWORD_FILM", "NONE")
            login.setText(l)
            password.setText(p)
        }
    }
   fun voidite(view: View){
        if(!sharedd.contains("MY_LOGIN_FILM") && !sharedd.contains("MY_PASSWORD_FILM")){
            if (login.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()){
                var editing = sharedd.edit()
                editing.putString("MY_LOGIN_FILM",login.text.toString())
                editing.putString("MY_PASSWORD_FILM",password.text.toString())
                editing.apply()
                val intent = Intent(this,MainScreen2::class.java)
                startActivity(intent)
            }
            else{
                val alter = AlertDialog.Builder(this)
                    .setTitle("Ошибка").setMessage("У Вас не заполнены поля").setPositiveButton("OK", null).create().show()
            }
        }
        else {
            var log = sharedd.getString("MY_LOGIN_FILM", "None")
            var pass = sharedd.getString("MY_PASSWORD_FILM", "None")
            login.setText(log)
            password.setText(pass)
            val intent = Intent(this, MainScreen2::class.java)
            startActivity(intent)
        }
    }
}