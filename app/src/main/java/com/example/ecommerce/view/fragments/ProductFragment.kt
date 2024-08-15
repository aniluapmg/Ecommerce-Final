package com.example.ecommerce.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerce.databinding.FragmentProductBinding
import com.example.ecommerce.data.Product
import com.example.ecommerce.model.retrofit.Servicio
import com.example.ecommerce.view.adapter.AdapterSearch
import com.example.ecommerce.view.viewModel.ProductViewModel
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProductFragment : Fragment() {

    private var productAdapter: AdapterSearch = AdapterSearch()
    private lateinit var binding: FragmentProductBinding
    private lateinit var recyclerView: RecyclerView
    private var products: List<Product> = listOf()
    //Para fragment se usa by activityViewModels
    private val productViewModel: ProductViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductBinding.inflate(inflater, container, false)
        recyclerView = binding.rvProduct
        recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = productAdapter // productAdapter sin ()
        //conectarApi() // Llama a la API después de configurar el RecyclerView
       getProducts()
        return binding.root
    }

    private fun getProducts() {
       //Es una corrutina.
        lifecycleScope.launch {
            val products = productViewModel.getProducts()
            productAdapter.setListProducts(products)
        }

    }


}