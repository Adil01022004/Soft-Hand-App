package com.example.softhand

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import java.net.CacheRequest


interface UserService {

    @POST("./registration")
    suspend fun registeruser(@Body request: UserRegistrationForm): Any


}