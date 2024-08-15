package com.example.ecommerce.model.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "products") //cada una de las tablas es una entidad
data class ProductEntity(
    @PrimaryKey // el Id de la línea 10 clave primaria
    @ColumnInfo(name = "id") //nos dice de manera explicita que la bbdd hay una columna primary key, la cual tendra de nombre ID
    val idProducto: String,

    @ColumnInfo(name = "title")  val title: String,
    @ColumnInfo(name = "price")  val price: Double,
    @ColumnInfo(name = "category")  val category: String,
    @ColumnInfo(name = "description")  val description: String,
    @ColumnInfo(name = "url")

    @SerializedName("image")
    val url: String

)
