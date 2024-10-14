package com.example.cp02mobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class FragmentPersonalidade : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_personalidade, container, false)

        // Obtém o argumento passado para o fragment
        val resultado = arguments?.getString("resultado")

        // Configura o TextView com o resultado
        val txtResultado = view.findViewById<TextView>(R.id.txtResultado)
        txtResultado.text = resultado

        return view
    }
}