package com.example.ecommerce.model.Provider

import android.content.Context
import androidx.room.Room
import com.example.ecommerce.model.room.ProductDatabase

class ProductProvider {

    fun providerRoom(context: Context): ProductDatabase {

        return Room.databaseBuilder(context, ProductDatabase::class.java, "Product-DB")
            .fallbackToDestructiveMigrationFrom()
            .allowMainThreadQueries()
            .build()
    }

}