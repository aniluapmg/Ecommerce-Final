package com.example.ecommerce.model.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ecommerce.data.Product
import com.example.ecommerce.model.model.ProductEntity

@Database(
    entities = [ProductEntity::class],
    version = 1,
    exportSchema = false
) //false trabajando forma interna
abstract class ProductDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDao //metodo abstracto
}