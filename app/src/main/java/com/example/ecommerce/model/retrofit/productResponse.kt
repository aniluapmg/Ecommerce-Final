package com.example.ecommerce.model.retrofit

import com.google.gson.annotations.SerializedName

data class ProductResponse(
val id: String,
val title: String,
val price: Double,
val category: String,
val description: String,
@SerializedName("image")
val url: String,
)






