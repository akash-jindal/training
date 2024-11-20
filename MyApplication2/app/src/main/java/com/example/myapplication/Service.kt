package com.example.myapplication

import retrofit2.http.GET

interface Service {
    @GET("objects")
    suspend fun getData() : Data
}