package com.example.ecommerce.data

import com.google.gson.annotations.SerializedName

data class Product(
    val id: String,
    val title: String,
    val price: Double,
    val category: String,
    val description: String,
    
    @SerializedName("image")
    val url: String,
)
