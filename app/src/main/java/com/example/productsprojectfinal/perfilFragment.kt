package com.example.productsprojectfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBindings
import com.example.productsprojectfinal.databinding.FragmentPerfilBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class perfilFragment : Fragment() {


    private lateinit var  binding: FragmentPerfilBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPerfilBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_perfil, container, false)
        //recibimos string porque asi le agregamos el argumento de tipo string en nav_graph
       // val idRecibido = arguments?.getString("id")
        //binding.pasando.setText(idRecibido)
       // return  binding.root




    }

}