package com.example.cp02mobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class Cadastro : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cadastro, container, false)

        fun spinnerExibicao() {
            val corGatos = listOf("Laranja", "Preto", "Cinza", "Branco", "Siamês", "Tigrado")
            val spinnerCorGato: Spinner = view.findViewById(R.id.spinnerCorGato)
            spinnerCorGato.adapter = ArrayAdapter(
                requireContext(),
                android.R.layout.simple_spinner_dropdown_item,
                corGatos
            )
        }

        fun spinnerSelecionarItem(): String {
            val spinnerCorGato: Spinner = view.findViewById(R.id.spinnerCorGato)
            return spinnerCorGato.selectedItem.toString()
        }

        spinnerExibicao()

        val btnCadastrar = view.findViewById<Button>(R.id.btnCadastrar)
        val inputNome = view.findViewById<EditText>(R.id.inputRaca)
        val inputNomeUser = view.findViewById<EditText>(R.id.inputNomeUser)
        val inputRaca = view.findViewById<EditText>(R.id.inputRaca)

        btnCadastrar.setOnClickListener {
            val nome = inputNome.text.toString()
            val nomeUser = inputNomeUser.text.toString()
            val raca = inputRaca.text.toString()
            val escolhido = spinnerSelecionarItem()

            val resultado = when (escolhido) {
                "Laranja" -> "Olá $nomeUser, O(A) $nome, da raça $raca, é um gato Brincalhão e cheio de energia, sempre pronto para explorar e conquistar novos lugares."
                "Preto" -> "Olá $nomeUser, O(A) $nome, da raça $raca, é um gato Misterioso e elegante, tem um charme único e é um verdadeiro companheiro nas horas mais tranquilas."
                "Cinza" -> "Olá $nomeUser, O(A) $nome, da raça $raca, é um gato Calmo e carinhoso, adora um colo quentinho e momentos de puro relaxamento."
                "Branco" -> "Olá $nomeUser, O(A) $nome, da raça $raca, é um gato Delicado e curioso, gosta de manter tudo em ordem e é muito observador."
                "Siamês" -> "Olá $nomeUser, O(A) $nome, da raça $raca, é um gato Falante e cheio de personalidade, adora atenção e se faz notar em qualquer ambiente."
                "Tigrado" -> "Olá $nomeUser, O(A) $nome, da raça $raca, é um gato Aventureiro e esperto, está sempre pronto para caçar e descobrir algo novo."
                else -> "Olá $nomeUser, O(A) $nome, da raça $raca, tem uma cor desconhecida."
            }


            val fragmentPersonalidade = FragmentPersonalidade()
            val bundle = Bundle()
            bundle.putString("resultado", resultado)
            fragmentPersonalidade.arguments = bundle


            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer,fragmentPersonalidade )
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}
