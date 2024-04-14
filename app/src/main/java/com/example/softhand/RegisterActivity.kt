package com.example.softhand

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST




class RegisterActivity:AppCompatActivity() {
    private lateinit var haveAccount: TextView
    private lateinit var registrationButton: TextView



    suspend fun postRequest(){
        val retrofit = Retrofit.Builder()
            .baseUrl("http://92.53.119.132/api/auth/") // Замените "http://yourserver.com/api/" на реальный URL вашего сервера
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        // Создаем объект, который реализует наш интерфейс UserService
        val userService = retrofit.create(UserService::class.java)

        // Создаем объект запроса регистрации пользователя
        val request = UserRegistrationForm("username", "email@example.com", "email", "password")

        // Отправляем POST-запрос на сервер

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_first_form)

        registrationButton = findViewById(R.id.registration_button)
        haveAccount = findViewById(R.id.have_account)

        haveAccount.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        registrationButton.setOnClickListener {
            val intent = Intent(this, TraidingActivity::class.java)
            startActivity(intent)
        }


    }
}