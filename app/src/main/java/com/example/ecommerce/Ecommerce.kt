package com.example.ecommerce

import android.app.Application
import com.example.ecommerce.model.Provider.ProductProvider
import com.example.ecommerce.model.room.ProductDatabase

class Ecommerce : Application() {

    private val productProvider = ProductProvider()

    companion object {
        lateinit var database: ProductDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = productProvider.providerRoom(this)
    }
}