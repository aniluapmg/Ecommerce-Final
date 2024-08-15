package com.example.ecommerce.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerce.R
import com.example.ecommerce.data.Product
import com.example.ecommerce.databinding.ItemProductBinding
import com.squareup.picasso.Picasso


class AdapterSearch(
    private var products: List<Product> = emptyList()
) : RecyclerView.Adapter<AdapterSearch.ViewHolder>() {

    private lateinit var binding: ItemProductBinding

    //private lateinit var products: List<Product>

    inner class ViewHolder(itemLayoutView: View) : RecyclerView.ViewHolder(itemLayoutView) {
        // Inicialización de binding
        init {
            binding = ItemProductBinding.bind(itemLayoutView)
        }
        fun onBind(product: Product) {
            binding.nameProduct.text = product.title
            binding.priceProduct.text = product.price.toString()
            Picasso.get().load(product.url).into(binding.imgProduct) //mostramos la imagen recuperada con piccaso

        }

    }

    fun setListProducts(productsResponse: List<Product>): List<Product> {
        products = productsResponse
        return products
    }

    /*override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding.root)
    }*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false))

    override fun getItemCount(): Int = products.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.onBind(products[position])


}
