package com.gabriel.augusto.netflox

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gabriel.augusto.netflox.databinding.FilmeViewBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class FilmeView : Fragment() {

    private var _binding: FilmeViewBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FilmeViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val bundle = arguments;

        if (bundle == null) {
            Log.d("impossivel", "eita")
            return
        }

        val args = FilmeViewArgs.fromBundle(bundle);

        println(args.idFilme)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.voltar_para_lista)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}