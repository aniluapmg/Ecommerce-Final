package com.example.ecommerce.view.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ecommerce.data.Product
import com.example.ecommerce.repository.ProductRepositoryImp

class ProductViewModel : ViewModel() {

    private val productRepositoryImp = ProductRepositoryImp()
    val product = MutableLiveData<Product>()
    suspend fun getProducts() = productRepositoryImp.getProducts()
    
    suspend fun getProductById(id: Int) = productRepositoryImp.getProductById(id)
}