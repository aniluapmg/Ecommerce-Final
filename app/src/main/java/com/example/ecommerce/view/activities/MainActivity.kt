package com.example.ecommerce.view.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.ecommerce.R
import com.example.ecommerce.databinding.ActivityMainBinding
import com.example.ecommerce.view.fragments.LoginFragment


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val loginFragment = LoginFragment()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setCurrentFragment(loginFragment)
    }
    
    fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, fragment)
            commit()
        }
    }
}