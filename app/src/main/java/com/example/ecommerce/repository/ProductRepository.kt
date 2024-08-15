package com.example.ecommerce.repository

import com.example.ecommerce.data.Product
import kotlinx.coroutines.flow.Flow

interface ProductRepository {
    // Se hizo el cambio a corrutinas a todas las funciones
    // Diferenciar que Product hacer referencia a data class del proyecto
    // y ProductEntity a la data class de la tabla de la bbdd
    suspend fun getProducts(): List<Product>
    suspend fun getProductById(id: Int): Product
    suspend fun addProduct(product: Product)
    suspend fun updateProduct(product: Product)
    suspend fun deleteProduct(product: Product) // uno elimina un todo, no por parte.
}