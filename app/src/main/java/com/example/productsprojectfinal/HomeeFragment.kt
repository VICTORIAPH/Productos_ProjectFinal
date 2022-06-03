package com.example.productsprojectfinal

import android.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBindings
import com.example.productsprojectfinal.databinding.FragmentHomeeBinding

class HomeeFragment : Fragment() {

private lateinit var binding: FragmentHomeeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            binding = FragmentHomeeBinding.inflate(layoutInflater)
            binding.buttonLogin.setOnClickListener {
        //        val action = HomeeFragmentDirections.actionHomeeFragmentToLOginFragment()
               // findNavController().navigate(action)
            }
        return binding.root
    }
}

