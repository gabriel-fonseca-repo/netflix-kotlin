package com.gabriel.augusto.netflox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gabriel.augusto.netflox.databinding.ListaFilmeViewBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ListaFilmeView : Fragment() {

    private var _binding: ListaFilmeViewBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ListaFilmeViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button1.setOnClickListener {
            findNavController().navigate(ListaFilmeViewDirections.selecionarFilme(1))
        }
        binding.button2.setOnClickListener {
            findNavController().navigate(ListaFilmeViewDirections.selecionarFilme(2))
        }
        binding.button3.setOnClickListener {
            findNavController().navigate(ListaFilmeViewDirections.selecionarFilme(3))
        }
        binding.button4.setOnClickListener {
            findNavController().navigate(ListaFilmeViewDirections.selecionarFilme(4))
        }
        binding.button5.setOnClickListener {
            findNavController().navigate(ListaFilmeViewDirections.selecionarFilme(5))
        }
        binding.button6.setOnClickListener {
            findNavController().navigate(ListaFilmeViewDirections.selecionarFilme(6))
        }
    }

    fun goToPage(v: View) {
        val pageNumber = v.tag.toString()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}