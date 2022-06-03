package com.example.productsprojectfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


    }
    private fun users(){
         val username: EditText
         val pass: EditText
         val btnLogin: Button

        username = findViewById(R.id.usernameEditTxt)
        pass = findViewById(R.id.passEditTxt)
        btnLogin = findViewById(R.id.btnLogin)


        btnLogin.setOnClickListener {
            if(username.text.toString().isEmpty())
                Toast.makeText(this, "la clave no debe estar vacia", Toast.LENGTH_SHORT).show()
            if(pass.text.toString().isEmpty())
                Toast.makeText(this, "la clave no debe estar vacia", Toast.LENGTH_SHORT).show()


            if (username.text.equals("raulph")&&pass.text.equals("123")){
                val intento = Intent(this, ProfileActivity::class.java)
                intento.putExtra("usuario", username.text.toString())
                startActivity(intento)
            }else if (username.text.equals("joseph")&&pass.text.equals("123")){
                val intento = Intent(this, Profile2Activity::class.java)
                intento.putExtra("usuario", username.text.toString())
                startActivity(intento)
            }else if (username.text.equals("abrahamph")&&pass.text.equals("123")){
                val intento = Intent(this, ProfileActivity::class.java)
                intento.putExtra("usuario", username.text.toString())
                startActivity(intento)
            }else {
                Toast.makeText(this, "Verifique su usuario", Toast.LENGTH_SHORT).show()

            }


        }
    }


}