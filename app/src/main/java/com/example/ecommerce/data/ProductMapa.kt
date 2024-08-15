package com.example.ecommerce.data

import com.example.ecommerce.model.model.ProductEntity
import com.example.ecommerce.model.retrofit.ProductResponse


fun Product.toEntity(): ProductEntity = ProductEntity(
        idProducto = id,
        title = title,
        price = price,
        category = category,
        description = description,
        url = url
    )

    fun ProductResponse.toEntity(): ProductEntity = ProductEntity(
        idProducto = id,
        title = title,
        price = price,
        category = category,
        description = description,
        url = url
    )

    fun productEntityToProduct(productEntity: ProductEntity): Product = Product(
        id = productEntity.idProducto,
        title = productEntity.title,
        price = productEntity.price,
        category = productEntity.category,
        description = productEntity.description,
        url = productEntity.url
    )

    fun productEntityListToProductList(list: List<ProductEntity>): List<Product> = list.map(::productEntityToProduct)
