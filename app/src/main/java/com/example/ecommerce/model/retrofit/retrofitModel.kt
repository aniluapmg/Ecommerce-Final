package com.example.ecommerce.model.retrofit

import com.example.ecommerce.data.Product
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MyAPI {
    @GET("products")
    fun getProducts(): Call<List<ProductResponse>>
}

object Servicio {
    private const val BASE_URL = "https://fakestoreapi.com/"
    val getProduct: MyAPI
        get() {
            //gson created an object who is capable to save a Json
            val gson = GsonBuilder().setLenient().create()
            //created an access port to HTTP protocol
            val interceptor = HttpLoggingInterceptor()
            //Show all the information from the keys
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            //In this case, client is the Android Device
            val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
            return retrofit.create(MyAPI::class.java)
        }
}





